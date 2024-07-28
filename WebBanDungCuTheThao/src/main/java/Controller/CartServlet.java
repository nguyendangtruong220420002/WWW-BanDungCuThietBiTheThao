package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import Connect.MongoDBUtil;
import Dao.Cart_DAO;
import Dao.LoaiSanPham_DAO;
import Modal.Cart;

/**
 * Servlet implementation class CartSevrlet
 */
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Cart_DAO cart_DAO;
	 public void init() {
	        MongoDBUtil.connect();
	        cart_DAO = new Cart_DAO();
	    }

	    public void destroy() {
	        MongoDBUtil.disconnect();
	    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Action = request.getParameter("action");
        if (Action != null && !Action.equals("")) {
            if (Action.equals("add")) {
                addToCart(request);
            } else if (Action.equals("update")) {
                updateCart(request);
            } else if (Action.equals("delete")) {
                deleteCart(request);
            }
        }
        response.sendRedirect("/WebBanDungCuTheThao/Cart.jsp");
	}

	protected void deleteCart(HttpServletRequest request) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String Index = request.getParameter("index");
		Cart_DAO dao = (Cart_DAO) session.getAttribute("cart");
		if (dao !=null) {
			dao.deleteCart(Index);
		}
	}

	protected void updateCart(HttpServletRequest request) {

		 HttpSession session = request.getSession();
		    String soluong = request.getParameter("quantity");
		    String Index = request.getParameter("index");

		    if (Index == null || soluong == null) {
		        System.out.println("Error: Index or quantity is null.");
		        return;
		    }

		    try {
		        Cart_DAO dao = (Cart_DAO) session.getAttribute("cart");
		        if (dao != null) {
		            dao.updateCart(Index, soluong);
		        }
		    } catch (NumberFormatException e) {
		        System.out.println("Error update: " + e.getMessage());
		        e.printStackTrace();
		    }
	}

	protected void addToCart(HttpServletRequest request) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String anh = request.getParameter("img");
		String ten = request.getParameter("tensanpham");
		String giatien = request.getParameter("giatien");
		String soluong = request.getParameter("soluongmua");
		Cart_DAO dao = (Cart_DAO) session.getAttribute("cart");
		if(dao == null) {
			dao = new Cart_DAO();
			session.setAttribute("cart", dao);
		}
		 System.out.println("Received parameters: anh=" + anh + ", ten=" + ten + ", giatien=" + giatien +", soluong=" + soluong);
	        dao.addCart( anh,ten ,giatien, soluong);
	        request.setAttribute("message", "không thành công ");	
		
	}


}
