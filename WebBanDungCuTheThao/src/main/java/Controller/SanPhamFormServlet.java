package Controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;

import java.util.List;


import Connect.MongoDBUtil;

import Dao.SanPham_DAO;
import Modal.LoaiSanPham;
import Modal.SanPham;

/**
 * Servlet implementation class SanPhamFromServlet
 */
public class SanPhamFormServlet extends HttpServlet {
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
    public SanPhamFormServlet() {
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
            request.getRequestDispatcher("QuanLy/DanhSachSanPham.jsp").forward(request, response);
        } else {
            String masanpham = request.getParameter("masanpham");
            if (masanpham != null) {
                SanPham sanPham = sanPham_DAO.findSanPhamById(masanpham);
                request.setAttribute("sanPham", sanPham);
            }
		
		List<LoaiSanPham> loaiSanPhamList = sanPham_DAO.getAllLoaiSanPham();
        request.setAttribute("loaiSanPhamList", loaiSanPhamList);
        request.getRequestDispatcher("QuanLy/SanPhamForm.jsp").forward(request, response);
           
        }
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	        String action = request.getParameter("action");
	        if ("Thêm".equals(action)) {
	            addSanPham(request, response);
	        } else if ("delete".equals(action)) {
	            deleteSanPham(request, response);
	        }else if ("edit".equals(action)) {
	            updateSanPham(request, response);
	        } else if("searchByName".equals(action)) {
	        	 doGet(request, response);
	        }
	}

	private void deleteSanPham(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String masanpham = request.getParameter("masanpham");
        sanPham_DAO.deleteSanPham(masanpham);
        response.sendRedirect("DanhSachSanPhamServlet");
	}

	private void addSanPham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String masanpham = request.getParameter("masanpham");
	        String tensanpham = request.getParameter("tensanpham");
	        String img = request.getParameter("img");
	        String mota = request.getParameter("mota");
	        double gia = Double.parseDouble(request.getParameter("gia"));
	        double giagiam = Double.parseDouble(request.getParameter("giagiam"));
	        int soluong = Integer.parseInt(request.getParameter("soluong"));
	        String tenloaisp = request.getParameter("tenloaisp");

	        SanPham sanPham = new SanPham(masanpham, tensanpham,img, mota, gia, giagiam, soluong, tenloaisp);

	        try {
	            sanPham_DAO.addSanPham(sanPham);
	            response.sendRedirect("DanhSachSanPhamServlet");
	        } catch (IllegalArgumentException e) {
	            // Xử lý khi mã loại đã tồn tại, ví dụ thông báo lỗi
	        	request.setAttribute("masanphamError", "Mã loại đã tồn tại, vui lòng chọn mã loại khác.");
	        	request.getRequestDispatcher("QuanLy/SanPhamForm.jsp").forward(request, response);
	        }   
	}
	private void updateSanPham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String masanpham = request.getParameter("masanpham");
	    String tensanpham = request.getParameter("tensanpham");
	    String img = request.getParameter("img");
	    String mota = request.getParameter("mota");
	    double gia = Double.parseDouble(request.getParameter("gia"));
        double giagiam = Double.parseDouble(request.getParameter("giagiam"));
        int soluong = Integer.parseInt(request.getParameter("soluong"));
	  
	    String tenloaisp = request.getParameter("tenloaisp");

	    SanPham sanPham = new SanPham(masanpham, tensanpham, img, mota, gia, giagiam, soluong, tenloaisp);
	    try {
	        sanPham_DAO.updateSanPham(sanPham); 
	        response.sendRedirect("DanhSachSanPhamServlet"); 
	    } catch (IllegalArgumentException e) {
	        request.setAttribute("masanphamError", "Mã loại đã tồn tại, vui lòng chọn mã loại khác.");
	        request.getRequestDispatcher("QuanLy/SanPhamForm.jsp").forward(request, response);
	    }
	}
	 

}