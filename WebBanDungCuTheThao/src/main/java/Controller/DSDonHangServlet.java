package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import Connect.MongoDBUtil;
import Dao.Pay_DAO;
import Modal.Pay;

/**
 * Servlet implementation class DSDonHangServlet
 */
public class DSDonHangServlet extends HttpServlet {
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
    public DSDonHangServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy ngày từ yêu cầu (nếu có)
    	String filterDate = request.getParameter("filterDate");

        List<Pay> payments = pay_DAO.getAllPayments();

        // Nếu có ngày lọc, lọc danh sách thanh toán
        if (filterDate != null && !filterDate.isEmpty()) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Định dạng ngày theo kiểu yyyy-MM-dd
            try {
                Date filter = sdf.parse(filterDate);
                String filterDateString = sdf.format(filter);

                payments = payments.stream()
                    .filter(payment -> {
                        Date purchaseDate = payment.getPurchaseDate();
                        return sdf.format(purchaseDate).equals(filterDateString);
                    })
                    .collect(Collectors.toList());
            } catch (Exception e) {
                e.printStackTrace();
                // Xử lý lỗi phân tích ngày nếu cần
            }
        }
        double totalSales = payments.stream()
                .mapToDouble(Pay::getTotal) // Giả sử Pay có phương thức getTotal() trả về tổng tiền
                .sum();

        request.setAttribute("payments", payments);
        request.setAttribute("totalSales", totalSales);
        request.setAttribute("filterDate", filterDate); // Đảm bảo ngày lọc được lưu vào request
        request.getRequestDispatcher("QuanLy/DSDonHang.jsp").forward(request, response);
    }

   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String filterDate = request.getParameter("filterDate"); // Nhận ngày lọc từ request
		    List<Pay> payments = pay_DAO.getAllPayments(); // Lấy tất cả đơn hàng
		    request.setAttribute("payments", payments);
		    request.setAttribute("filterDate", filterDate); // Lưu ngày lọc vào request
		    request.getRequestDispatcher("QuanLy/DSDonHang.jsp").forward(request, response);
	}

}
