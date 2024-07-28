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
 * Servlet implementation class LoaiSanPhamServlet
 */
public class LoaiSanPhamServlet extends HttpServlet {
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
    public LoaiSanPhamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<LoaiSanPham> loaiSanPhamList = loaiSanPhamDAO.getAllLoaiSanPham();
        request.setAttribute("loaiSanPhamList", loaiSanPhamList);
        request.getRequestDispatcher("QuanLy/LoaiSanPhamForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String action = request.getParameter("action");
	        if ("add".equals(action)) {
	            addLoaiSanPham(request, response);
	        } else if ("delete".equals(action)) {
	            deleteLoaiSanPham(request, response);
	        }
	}
	private void addLoaiSanPham(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String maloaisp = request.getParameter("maloai");
        String tenloaisp = request.getParameter("tenloai");
        String ghichu = request.getParameter("ghichu");

        LoaiSanPham loaiSanPham = new LoaiSanPham(maloaisp, tenloaisp, ghichu);
        try {
            loaiSanPhamDAO.addLoaiSanPham(loaiSanPham);
            response.sendRedirect("DanhSachLoaiSanPhamServlet");
        } catch (IllegalArgumentException e) {
            // Xử lý khi mã loại đã tồn tại, ví dụ thông báo lỗi
        	request.setAttribute("maloaiError", "Mã loại đã tồn tại, vui lòng chọn mã loại khác.");
        	request.getRequestDispatcher("QuanLy/LoaiSanPhamForm.jsp").forward(request, response);
        }
    }

 
    private void deleteLoaiSanPham(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String maloaisp = request.getParameter("maloai");
        loaiSanPhamDAO.deleteLoaiSanPham(maloaisp);
        response.sendRedirect("DanhSachLoaiSanPhamServlet");
    }

}

