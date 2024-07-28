package Modal;

public class User {
	String mauser;
	String tenuser;
	String password;
	String email;
	String role;
	public String getMauser() {
		return mauser;
	}
	public void setMauser(String mauser) {
		this.mauser = mauser;
	}
	public String getTenuser() {
		return tenuser;
	}
	public void setTenuser(String tenuser) {
		this.tenuser = tenuser;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String mauser, String tenuser, String password, String email, String role) {
		super();
		this.mauser = mauser;
		this.tenuser = tenuser;
		this.password = password;
		this.email = email;
		this.role = "user";
	}
	public User(String tenuser, String password, String email) {
		super();
		this.tenuser = tenuser;
		this.password = password;
		this.email = email;
	}
	
	
	
}
