package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Connect.MongoDBUtil;
import Dao.Cart_DAO;
import Dao.Pay_DAO;
import Modal.Cart;
import Modal.Pay;
import Modal.SanPham;

/**
 * Servlet implementation class PayServlet
 */
public class PayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Pay_DAO pay_DAO;
	 public void init() {
	        MongoDBUtil.connect();
	        pay_DAO = new Pay_DAO();
	    }

	    public void destroy() {
	        MongoDBUtil.disconnect();
	    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false); // Lấy session hiện tại, không tạo mới nếu không tồn tại
        if (session == null || session.getAttribute("email") == null) {
        	request.setAttribute("payError", "Vui lòng đăng nhập để hoàn thành đơn hàng.Xin cám ơn !!!.");
        	request.getRequestDispatcher("Cart.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("Pay.jsp").forward(request, response);
        }
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String action = request.getParameter("action");

		    if ("processPayment".equals(action)) {
		        // Lấy thông tin từ form
		        String fullName = request.getParameter("fullName");
		        String email = request.getParameter("email");
		        String address = request.getParameter("address");
		        String phone = request.getParameter("phone");
		        String ghichu = request.getParameter("ghichu");
		        String paymentMethod = request.getParameter("paymentMethod");

		        // Tạo đối tượng Pay và thiết lập thông tin
		        Pay payment = new Pay();
		        payment.setHoten(fullName);
		        payment.setEmail(email);
		        payment.setAddress(address);
		        payment.setPhone(phone);
		        payment.setGhichu(ghichu);
		        payment.setPaymentMethod(paymentMethod);

		        // Lấy thông tin giỏ hàng từ session
		        HttpSession session = request.getSession();
		        List<Cart> cartItems = (List<Cart>) session.getAttribute("cartItems");
		        if (cartItems == null || cartItems.isEmpty()) {
		            // Thông báo lỗi nếu giỏ hàng trống
		            request.setAttribute("error", "Giỏ hàng trống. Vui lòng thêm sản phẩm vào giỏ hàng trước khi thanh toán.");
		            request.getRequestDispatcher("Cart.jsp").forward(request, response);
		            return;
		        }

		        // Chuyển đổi từ Cart sang SanPham
		        List<SanPham> sanPhams = new ArrayList<>();
		        for (Cart cart : cartItems) {
		            SanPham sanPham = new SanPham();
		            sanPham.setMasanpham(cart.getId());
		            sanPham.setTensanpham(cart.getTensanpham());
		            sanPham.setImg(cart.getImg());
		            sanPham.setGiagiam(cart.getGiagiam());
		            sanPham.setSoluong(cart.getSoluongmua());
		            sanPham.setGia(cart.getTamtinh());
		            sanPhams.add(sanPham);
		        }

		        payment.setSanPhams(sanPhams);
		        String userId = (String) session.getAttribute("email");
		        if (userId == null) {
		            request.setAttribute("payError", "Không thể xác định người dùng. Vui lòng đăng nhập lại.");
		            request.getRequestDispatcher("Cart.jsp").forward(request, response);
		            return;
		        }
		        payment.setUserId(userId);

		        Double totalAmount = (Double) session.getAttribute("totalAmount");
		        if (totalAmount == null || totalAmount <= 0) {
		            // Thông báo lỗi nếu tổng tiền không hợp lệ
		            request.setAttribute("payError", "Tổng tiền không hợp lệ. Vui lòng kiểm tra lại giỏ hàng.");
		            request.getRequestDispatcher("Cart.jsp").forward(request, response);
		            return;
		        }
		        payment.setTotal(totalAmount);
		        
		        // Xóa giỏ hàng khỏi session
		        session.removeAttribute("cart");

		      
		        Pay_DAO payDAO = new Pay_DAO();
		        payDAO.savePayment(payment);
		        response.sendRedirect("Success.jsp");
		    }
	}

}
