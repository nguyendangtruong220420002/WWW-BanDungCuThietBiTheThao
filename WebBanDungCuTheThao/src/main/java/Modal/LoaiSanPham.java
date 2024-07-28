package Modal;

public class LoaiSanPham {
		String maloaisp;
		String tenloaisp;
		String ghichu;
		public LoaiSanPham() {
			super();
			// TODO Auto-generated constructor stub
		}
		public LoaiSanPham(String maloaisp, String tenloaisp, String ghichu) {
			super();
			this.maloaisp = maloaisp;
			this.tenloaisp = tenloaisp;
			this.ghichu = ghichu;
		}
		public String getMaloaisp() {
			return maloaisp;
		}
		public void setMaloaisp(String maloaisp) {
			this.maloaisp = maloaisp;
		}
		public String getTenloaisp() {
			return tenloaisp;
		}
		public void setTenloaisp(String tenloaisp) {
			this.tenloaisp = tenloaisp;
		}
		public String getGhichu() {
			return ghichu;
		}
		public void setGhichu(String ghichu) {
			this.ghichu = ghichu;
		}
		
		
}
