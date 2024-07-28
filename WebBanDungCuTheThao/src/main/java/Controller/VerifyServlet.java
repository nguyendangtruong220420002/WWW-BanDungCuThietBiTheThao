package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import Connect.MongoDBUtil;
import Dao.User_Dao;
import Modal.User;

/**
 * Servlet implementation class VerifyServlet
 */
public class VerifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private User_Dao user_Dao;

    public void init() {
        // Initialize MongoDB connection and User_Dao
        MongoDBUtil.connect();
        user_Dao = new User_Dao();
    }

    public void destroy() {
        MongoDBUtil.disconnect();
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerifyServlet() {
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
		 String enteredCode = request.getParameter("verificationCode");
	        HttpSession session = request.getSession();
	        String correctCode = (String) session.getAttribute("verificationCode");
	        User user = (User) session.getAttribute("user");

	        if (enteredCode != null && enteredCode.equals(correctCode)) {
	            // Xác thực thành công
	            user_Dao.addUser(user); // Lưu thông tin người dùng vào MongoDB
	            session.setAttribute("registerSuccess", true);
	            session.removeAttribute("verificationCode"); 
	        } else {
	            // Xác thực thất bại
	        	 session.setAttribute("registerSuccess", false); 	    
	        }
	        response.sendRedirect("index.jsp");
	    }

}