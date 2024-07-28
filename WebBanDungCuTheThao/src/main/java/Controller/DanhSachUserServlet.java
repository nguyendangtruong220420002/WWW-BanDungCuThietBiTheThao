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
import Dao.User_Dao;
import Modal.User;

/**
 * Servlet implementation class DanhSachUserServlet
 */
public class DanhSachUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private User_Dao user_Dao;
	public void init() {
        MongoDBUtil.connect();
        user_Dao = new User_Dao();
    }

    public void destroy() {
        MongoDBUtil.disconnect();
    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String query = request.getParameter("query");
		List<User> users;
	    if (query != null && !query.isEmpty()) {
	        // Tìm kiếm theo email
	        users = user_Dao.getUsersByEmail(query);
	    } else {
	        // Lấy tất cả người dùng nếu không có truy vấn
	        users = user_Dao.getAllUsersWithRole("user");
	    }
		//List<User> users = user_Dao.getAllUsersWithRole("user");
        request.setAttribute("users", users);
        request.getRequestDispatcher("QuanLy/DanhSachUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");

	    if ("edit".equals(action)) {
	        // Lấy mã người dùng và thông tin người dùng từ yêu cầu
	        String maUser = request.getParameter("maUser");
	        User user = user_Dao.getUserById(maUser); // Lấy thông tin người dùng theo mã người dùng
	        
	        // Đặt đối tượng người dùng vào thuộc tính yêu cầu và chuyển hướng đến trang chỉnh sửa
	        request.setAttribute("user", user);
	        request.getRequestDispatcher("QuanLy/EditUser.jsp").forward(request, response);
	        
	       
	    } else  if ("update".equals(action)) {
            // Lấy mã người dùng và thông tin người dùng từ yêu cầu
            String maUser = request.getParameter("maUser");
            String tenUser = request.getParameter("tenuser");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            String role = request.getParameter("role");
            
            // Tạo đối tượng User với thông tin từ form
            User user = new User();
            user.setMauser(maUser);
            user.setTenuser(tenUser);
            user.setPassword(password);
            user.setEmail(email);
            user.setRole(role);
            
            // Cập nhật người dùng
            user_Dao.updateUser(user);
            
            // Chuyển hướng đến danh sách người dùng sau khi cập nhật thành công
            response.sendRedirect("DanhSachUserServlet");
	    }
	    else if ("delete".equals(action)) {
	        // Xử lý xóa người dùng
	        String maUser = request.getParameter("maUser");
	        user_Dao.deleteUser(maUser);
	        response.sendRedirect("danhSachUser");
	    }
        
    }
	

}
