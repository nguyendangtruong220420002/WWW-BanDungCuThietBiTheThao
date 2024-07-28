package Dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;

import Connect.MongoDBUtil;
import Modal.LoaiSanPham;
import Modal.SanPham;

public class SanPham_DAO {
    private MongoCollection<Document> loaiSanPhamcollection;
    private MongoCollection<Document> sanPhamcollection;

    public SanPham_DAO() {
        MongoDatabase database = MongoDBUtil.getDatabase();
        loaiSanPhamcollection = database.getCollection("LOAISANPHAM");
        sanPhamcollection = database.getCollection("SANPHAM");
    }

    public void addSanPham(SanPham sanPham) {
    	if (sanPhamcollection.find(new Document("MASANPHAM", sanPham.getMasanpham())).first() != null) {
	        throw new IllegalArgumentException("Mã loại đã tồn tại");
	    }
        Document doc = new Document("MASANPHAM", sanPham.getMasanpham())
            .append("TENSANPHAM", sanPham.getTensanpham())
            .append("IMG", sanPham.getImg())
            .append("MOTA", sanPham.getMota())
            .append("GIA", sanPham.getGia())
            .append("GIAGIAM", sanPham.getGiagiam())
            .append("SOLUONG", sanPham.getSoluong())
            .append("TENLOAI", sanPham.getTenloaisp());
        sanPhamcollection.insertOne(doc);
    }

    public void updateSanPham(SanPham sanPham) {
    	try {
            Bson filter = Filters.eq("MASANPHAM", sanPham.getMasanpham());
            Bson updates = Updates.combine(
                Updates.set("TENSANPHAM", sanPham.getTensanpham()),
                Updates.set("IMG", sanPham.getImg()),
                Updates.set("MOTA", sanPham.getMota()),
                Updates.set("GIA", sanPham.getGia()),
                Updates.set("GIAGIAM", sanPham.getGiagiam()),
                Updates.set("SOLUONG", sanPham.getSoluong()),
                Updates.set("TENLOAI", sanPham.getTenloaisp())
            );
            UpdateResult result = sanPhamcollection.updateOne(filter, updates);
            if (result.getModifiedCount() == 0) {
                throw new IllegalArgumentException("Không tìm thấy sản phẩm để cập nhật hoặc không có thay đổi nào được áp dụng.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }     
    }
    public void deleteSanPham(String masanpham) {
        sanPhamcollection.deleteOne( new Document("MASANPHAM", masanpham));
    }

    public SanPham findSanPhamById(String masanpham) {
        Document doc = sanPhamcollection.find(Filters.eq("MASANPHAM", masanpham)).first();
        if (doc != null) {
            return new SanPham(
                doc.getString("MASANPHAM"),
                doc.getString("TENSANPHAM"),
                doc.getString("IMG"),
                doc.getString("MOTA"),
                doc.getDouble("GIA"),
                doc.getDouble("GIAGIAM"),
                doc.getInteger("SOLUONG"),
                doc.getString("TENLOAI")
            );
        }
        return null;
    }

    public List<SanPham> getAllSanPham() {
        List<SanPham> list = new ArrayList<>();
        for (Document doc : sanPhamcollection.find()) {
            SanPham sp = new SanPham(
                doc.getString("MASANPHAM"),
                doc.getString("TENSANPHAM"),
                doc.getString("IMG"),
                doc.getString("MOTA"),
                doc.getDouble("GIA"),
                doc.getDouble("GIAGIAM"),
                doc.getInteger("SOLUONG"),
                doc.getString("TENLOAI")
            );
            list.add(sp);
        }
        return list;
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
    public List<SanPham> searchSanPhamByName(String tensanpham) {
        List<SanPham> list = new ArrayList<>();
        Bson filter = Filters.regex("TENSANPHAM", tensanpham, "i");
        for (Document doc : sanPhamcollection.find(filter)) {
            SanPham sp = new SanPham(
                doc.getString("MASANPHAM"),
                doc.getString("TENSANPHAM"),
                doc.getString("IMG"),
                doc.getString("MOTA"),
                doc.getDouble("GIA"),
                doc.getDouble("GIAGIAM"),
                doc.getInteger("SOLUONG"),
                doc.getString("TENLOAI")
            );
            list.add(sp);
        }
        return list;
    }
    
}
