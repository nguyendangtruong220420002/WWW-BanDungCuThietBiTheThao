package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Connect.MongoDBUtil;
import Dao.SanPham_DAO;
import Modal.SanPham;

/**
 * Servlet implementation class ChiTietSanPhamServlet
 */
public class ChiTietSanPhamServlet extends HttpServlet {
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
    public ChiTietSanPhamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String masanpham = request.getParameter("masanpham");
	        if (masanpham != null) {
	            // Lấy thông tin chi tiết sản phẩm từ cơ sở dữ liệu
	            SanPham sanPham = sanPham_DAO.findSanPhamById(masanpham);
	            if (sanPham != null) {
	                request.setAttribute("sanPham", sanPham);
	                request.getRequestDispatcher("ChiTietSanPham.jsp").forward(request, response);
	            } else {
	                response.sendRedirect("ProductsServlet");
	            }
	        } else {
	            response.sendRedirect("ProductsServlet");
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
