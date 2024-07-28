package Modal;

public class SanPham {
	String masanpham;
	String tensanpham;
	String img;
	String mota;
	double gia;
	double giagiam;
	int soluong;
	String tenloaisp;
	public String getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(String masanpham) {
		this.masanpham = masanpham;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public double getGiagiam() {
		return giagiam;
	}
	public void setGiagiam(double giagiam) {
		this.giagiam = giagiam;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
	public SanPham(String masanpham, String tensanpham, String img, String mota, double gia, double giagiam,
			int soluong, String tenloaisp) {
		super();
		this.masanpham = masanpham;
		this.tensanpham = tensanpham;
		this.img = img;
		this.mota = mota;
		this.gia = gia;
		this.giagiam = giagiam;
		this.soluong = soluong;
		this.tenloaisp = tenloaisp;
	}
	public String getTenloaisp() {
		return tenloaisp;
	}
	public void setTenloaisp(String tenloaisp) {
		this.tenloaisp = tenloaisp;
	}
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
