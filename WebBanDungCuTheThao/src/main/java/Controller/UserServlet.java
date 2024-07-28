package Controller;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Properties;

import Connect.MongoDBUtil;
import Dao.User_Dao;
import Modal.User;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
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
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 // Lấy thông tin người dùng từ form đăng ký
		   String tenuser = request.getParameter("tenuser");
	        String password = request.getParameter("password");
	        String email = request.getParameter("email");
	        
	        // Tạo mã xác thực ngẫu nhiên
	        String verificationCode = generateVerificationCode();
	     // Tạo session để lưu thông tin người dùng và mã xác thực
	        HttpSession session = request.getSession();
	        session.setAttribute("user", new User(tenuser, password, email));
	        session.setAttribute("verificationCode", verificationCode);
	        session.setAttribute("email", email);
	     // Gửi email xác thực đến người dùng
	        sendVerificationEmail(email, verificationCode);
	        // Chuyển hướng người dùng đến trang xác thực
	        session.setAttribute("showVerifyModal", true);
	     // Chuyển hướng về trang chính (index.jsp)
	        response.sendRedirect("index.jsp");
	     
        
	}

	private void sendVerificationEmail(String email, String verificationCode) {
		// TODO Auto-generated method stub
		// Thông tin cấu hình email
	    final String from = "nguyendangtruong22042002@gmail.com";
	    final String host = "smtp.gmail.com"; 
	    final String username = "nguyendangtruong22042002@gmail.com"; 
	    final String password = "razl zszf ccse lbfd"; 
        
	    // Cấu hình thuộc tính SMTP
	    Properties props = new Properties();
	    props.put("mail.smtp.host", host);
	    props.put("mail.smtp.auth", "true"); 
	    props.put("mail.smtp.port", "587"); 
	    props.put("mail.smtp.starttls.enable", "true");
	 // Tạo phiên làm việc với xác thực
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("Xác thực đăng ký tài khoản");
            message.setText("Mã xác thực của bạn là: " + verificationCode);
            Transport.send(message);
            // Gửi email
            System.out.println("Email đã được gửi thành công!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
		
	}

	private String generateVerificationCode() {
		// TODO Auto-generated method stub
		return String.format("%06d", (int)(Math.random() * 1000000));
	}

}
