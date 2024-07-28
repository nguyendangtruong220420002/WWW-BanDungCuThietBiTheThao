package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import Connect.MongoDBUtil;
import Dao.SanPham_DAO;
import Modal.SanPham;

/**
 * Servlet implementation class TimKiemProductsServlet
 */
public class TimKiemProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SanPham_DAO sanPham_DAO;
	 public void init() {
	        MongoDBUtil.connect();
	        sanPham_DAO = new SanPham_DAO();
	    }

	    public void destroy() {
	        MongoDBUtil.disconnect();
	    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimKiemProductsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
        String query = request.getParameter("query");
        if ("searchByName".equals(action)) {
            List<SanPham> sanPhamList = sanPham_DAO.searchSanPhamByName(query);
            request.setAttribute("sanPhamList", sanPhamList);
            request.getRequestDispatcher("Products.jsp").forward(request, response);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String action = request.getParameter("action");
		 if("searchByName".equals(action)) {
        	 doGet(request, response);
        }
	}

}
