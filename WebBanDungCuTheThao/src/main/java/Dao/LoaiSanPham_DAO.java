	package Dao;
	
	import java.util.ArrayList;
	import java.util.List;
	
	import org.bson.Document;
	
	import com.mongodb.client.MongoCollection;
	import com.mongodb.client.MongoDatabase;
	
	import Connect.MongoDBUtil;
	import Modal.LoaiSanPham;
	
	public class LoaiSanPham_DAO {
		private MongoCollection<Document> loaiSanPhamcollection;
		public LoaiSanPham_DAO() {
			// TODO Auto-generated constructor stub
			MongoDatabase database = MongoDBUtil.getDatabase();
			loaiSanPhamcollection = database.getCollection("LOAISANPHAM");
		}
		 public List<LoaiSanPham> getAllLoaiSanPham() {
		        List<LoaiSanPham> list = new ArrayList<>();
		        for (Document doc : loaiSanPhamcollection.find()) {
		            LoaiSanPham loaiSanPham = new LoaiSanPham(
		                doc.getString("MALOAI"),
		                doc.getString("TENLOAI"),
		                doc.getString("GHICHU")
		            );
		            list.add(loaiSanPham);
		        }
		        return list;
		    }
		 public void addLoaiSanPham(LoaiSanPham loaiSanPham) {
			 if (loaiSanPhamcollection.find(new Document("MALOAI", loaiSanPham.getMaloaisp())).first() != null) {
			        throw new IllegalArgumentException("Mã loại đã tồn tại");
			    }
		        Document doc = new Document("MALOAI", loaiSanPham.getMaloaisp())
		            .append("TENLOAI", loaiSanPham.getTenloaisp())
		            .append("GHICHU", loaiSanPham.getGhichu());
		        loaiSanPhamcollection.insertOne(doc);
		    }
	
		   
	
		    public void deleteLoaiSanPham(String maloai) {
		        loaiSanPhamcollection.deleteOne(new Document("MALOAI", maloai));
		    }
		    
	}
	
