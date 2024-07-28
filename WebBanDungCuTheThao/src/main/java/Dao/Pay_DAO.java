package Dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Sorts;

import Connect.MongoDBUtil;
import Modal.Pay;
import Modal.SanPham;

public class Pay_DAO {
	private MongoCollection<Document> usercollection;
	private MongoCollection<Document> sanPhamcollection;
	private MongoCollection<Document> paycollection;
	public Pay_DAO() {
		// TODO Auto-generated constructor stub
		MongoDatabase database = MongoDBUtil.getDatabase();
		usercollection = database.getCollection("USER");
		sanPhamcollection = database.getCollection("SANPHAM");
		paycollection = database.getCollection("THANHTOAN");
	}
	 public void savePayment(Pay payment) {
		 TimeZone vietnamTimeZone = TimeZone.getTimeZone("Asia/Ho_Chi_Minh");
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	        sdf.setTimeZone(vietnamTimeZone);
	        String formattedDate = sdf.format(new Date());

		 Document paymentDoc = new Document("userId", payment.getUserId())
			        .append("address", payment.getAddress())
			        .append("paymentMethod", payment.getPaymentMethod())
			        .append("total", payment.getTotal())
			        .append("phone", payment.getPhone())
			        .append("email", payment.getEmail())
			        .append("hoten", payment.getHoten())
			        .append("ghichu", payment.getGhichu())
		  			.append("purchaseDate", formattedDate);

			    List<Document> sanPhamDocs = new ArrayList<>();
			    List<SanPham> sanPhams = payment.getSanPhams();
			    if (sanPhams != null) {
			        for (SanPham sp : sanPhams) {
			            Document spDoc = new Document("tensanpham", sp.getTensanpham())
			                .append("soluong", sp.getSoluong())
			                .append("gia", sp.getGiagiam());
			            sanPhamDocs.add(spDoc);
			        }
			    }

			    paymentDoc.append("sanPhams", sanPhamDocs);
			    paycollection.insertOne(paymentDoc);
	 }
	 public List<Pay> getAllPayments() {
	        List<Pay> payments = new ArrayList<>();
	        FindIterable<Document> documents = paycollection.find().sort(Sorts.descending("purchaseDate"));
	        

	        for (Document doc : documents) {
	            Pay payment = new Pay();
	            payment.setUserId(doc.getString("userId"));
	            payment.setAddress(doc.getString("address"));
	            payment.setPaymentMethod(doc.getString("paymentMethod"));
	            payment.setTotal(doc.getDouble("total"));
	            payment.setPhone(doc.getString("phone"));
	            payment.setEmail(doc.getString("email"));
	            payment.setHoten(doc.getString("hoten"));
	            payment.setGhichu(doc.getString("ghichu"));
	            
	            Object purchaseDateObj = doc.get("purchaseDate");
	            if (purchaseDateObj instanceof Date) {
	                payment.setPurchaseDate((Date) purchaseDateObj);
	            } else if (purchaseDateObj instanceof String) {
	                String purchaseDateStr = (String) purchaseDateObj;
	                try {
	                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	                    Date purchaseDate = sdf.parse(purchaseDateStr);
	                    payment.setPurchaseDate(purchaseDate);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }

	            List<SanPham> sanPhams = new ArrayList<>();
	            List<Document> sanPhamDocs = (List<Document>) doc.get("sanPhams");
	            if (sanPhamDocs != null) {
	                for (Document spDoc : sanPhamDocs) {
	                    SanPham sp = new SanPham();
	                    sp.setTensanpham(spDoc.getString("tensanpham"));
	                    sp.setSoluong(spDoc.getInteger("soluong"));
	                    sp.setGiagiam(spDoc.getDouble("gia"));
	                    sanPhams.add(sp);
	                }
	            }
	            payment.setSanPhams(sanPhams);
	            payments.add(payment);
	        }
	        return payments;
	    }
	 
	 
	
}