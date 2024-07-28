package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Connect.MongoDBUtil;
import Dao.SanPham_DAO;
import Modal.SanPham;

/**
 * Servlet implementation class Products
 */
public class ProductsServlet extends HttpServlet {
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
    public ProductsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<SanPham> sanPhamList = sanPham_DAO.getAllSanPham();
	    
	    // Lấy danh sách loại sản phẩm duy nhất
	    Set<String> loc = new HashSet<>();
	    for (SanPham sanPham : sanPhamList) {
	        loc.add(sanPham.getTenloaisp());
	    }

	    // Gán danh sách sản phẩm và danh sách loại sản phẩm duy nhất vào request attributes
	    request.setAttribute("sanPhamList", sanPhamList);
	    request.setAttribute("loc", loc);
	    
	    // Chuyển tiếp yêu cầu đến trang JSP
	    request.getRequestDispatcher("Products.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
