package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import Connect.MongoDBUtil;
import Dao.LoaiSanPham_DAO;
import Modal.LoaiSanPham;

/**
 * Servlet implementation class DanhSachLoaiSanPhamServlet
 */
public class DanhSachLoaiSanPhamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoaiSanPham_DAO loaiSanPhamDAO;
	 public void init() {
	        MongoDBUtil.connect();
	        loaiSanPhamDAO = new LoaiSanPham_DAO();
	    }

	    public void destroy() {
	        MongoDBUtil.disconnect();
	    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachLoaiSanPhamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<LoaiSanPham> loaiSanPhamList = loaiSanPhamDAO.getAllLoaiSanPham();
        request.setAttribute("loaiSanPhamList", loaiSanPhamList);
        request.getRequestDispatcher("QuanLy/LoaiSanPham.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
