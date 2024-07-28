package Modal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pay {
	 private String userId;
	    private String address;
	    private String paymentMethod;
	    private double total;
	    private String phone;
	    private String email;
	    private String hoten;
	    private String ghichu;
	    private Date purchaseDate;
	    public Date getPurchaseDate() {
			return purchaseDate;
		}
		public void setPurchaseDate(Date purchaseDate) {
			this.purchaseDate = purchaseDate;
		}
		private List<SanPham> sanPhams;
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPaymentMethod() {
			return paymentMethod;
		}
		public void setPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getHoten() {
			return hoten;
		}
		public void setHoten(String hoten) {
			this.hoten = hoten;
		}
		public String getGhichu() {
			return ghichu;
		}
		public void setGhichu(String ghichu) {
			this.ghichu = ghichu;
		}
		public List<SanPham> getSanPhams() {
			 
		        return sanPhams;
		}
		public void setSanPhams(List<SanPham> sanPhams) {
			this.sanPhams = sanPhams;
		}
		public Pay(String userId, String address, String paymentMethod, double total, String phone, String email,
				String hoten, String ghichu, Date purchaseDate, List<SanPham> sanPhams) {
			super();
			this.userId = userId;
			this.address = address;
			this.paymentMethod = paymentMethod;
			this.total = total;
			this.phone = phone;
			this.email = email;
			this.hoten = hoten;
			this.ghichu = ghichu;
			this.purchaseDate = purchaseDate;
			this.sanPhams = sanPhams;
		}
		public Pay() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
	    
}
