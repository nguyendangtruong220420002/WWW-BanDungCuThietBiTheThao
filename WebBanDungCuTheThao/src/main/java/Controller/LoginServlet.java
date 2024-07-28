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
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
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
    public LoginServlet() {
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
		String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user  = user_Dao.getLoginUserRole( email, password);
        if (user  != null) {
            HttpSession session = request.getSession();
            session.setAttribute("mauser", user.getMauser());
            session.setAttribute("ten", user.getTenuser());
            session.setAttribute("email", user.getEmail());
            session.setAttribute("role", user.getRole());
            session.setAttribute("loginSuccess", true);
            
            if (user.getRole().equals("user")) {
                response.sendRedirect("index.jsp");
            } else if (user.getRole().equals("admin")) {
                response.sendRedirect("Admin.jsp");
            }
        } else {
        	HttpSession session = request.getSession();
            session.setAttribute("loginFailed", true);
            response.sendRedirect("index.jsp");
        
        }
        
	}

}
