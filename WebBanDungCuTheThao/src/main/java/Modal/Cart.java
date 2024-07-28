package Modal;

public class Cart {
	String id;
	String img;
	String tensanpham;
	double giagiam;
	int soluongmua;
	double tamtinh;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public double getGiagiam() {
		return giagiam;
	}
	public void setGiagiam(double giagiam) {
		this.giagiam = giagiam;
	}
	public int getSoluongmua() {
		return soluongmua;
	}
	public void setSoluongmua(int soluongmua) {
		this.soluongmua = soluongmua;
	}
	public double getTamtinh() {
		return tamtinh;
	}
	public void setTamtinh(double tamtinh) {
		this.tamtinh = tamtinh;
	}

	public Cart(String id, String img, String tensanpham, double giagiam, int soluongmua, double tamtinh) {
		super();
		this.id = id;
		this.img = img;
		this.tensanpham = tensanpham;
		this.giagiam = giagiam;
		this.soluongmua = soluongmua;
		this.tamtinh = tamtinh;
	
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
