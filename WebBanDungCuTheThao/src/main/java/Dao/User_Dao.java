package Dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Sorts;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;

import Connect.MongoDBUtil;
import Modal.User;

public class User_Dao {
	private MongoCollection<Document> usercollection;
public User_Dao() {
	// TODO Auto-generated constructor stub
	MongoDatabase database = MongoDBUtil.getDatabase();
	 usercollection = database.getCollection("USER");
}
private String generateMaUser() {
    Document lastUser = usercollection.find().sort(Sorts.descending("MA_USER")).first();
    if (lastUser != null) {
        String lastMaUser = lastUser.getString("MA_USER");
        int userNumber = Integer.parseInt(lastMaUser.substring(4)) + 1;
        return "USER" + userNumber;
    } else {
        return "USER1";
    }
}

public void addUser(User user) {
	String maUser = generateMaUser();
    user.setMauser(maUser);

    if (user.getRole() == null) {
        user.setRole("user");
    }
	 Document doc = new Document("MA_USER", user.getMauser())
			 .append("TEN", user.getTenuser())
			 .append("PASSWORD", user.getPassword())
			 .append("GMAIL", user.getEmail())
			 .append("ROLE", user.getRole());
	 usercollection.insertOne(doc);
}
// sử lý đăng nhập User va Admin
public User getLoginUserRole(String email, String password) {
    Document userDoc = usercollection.find(Filters.and(
 
            Filters.eq("GMAIL", email),
            Filters.eq("PASSWORD", password)
    )).first();

    if (userDoc != null) {
    	 User user = new User();
    	 user.setMauser(userDoc.getString("MA_USER"));
         user.setTenuser(userDoc.getString("TEN"));
         user.setEmail(userDoc.getString("GMAIL"));
         user.setPassword(userDoc.getString("PASSWORD"));
         user.setRole(userDoc.getString("ROLE"));
         return user;
    } else {
        return null; //  không tìm thấy người dùng
    }
}
public void updateUser(User user) {
    try {
        // Tạo truy vấn để tìm tài liệu người dùng dựa trên mã người dùng
        Bson filter = Filters.eq("MA_USER", user.getMauser());

        // Tạo các trường cần cập nhật
        Bson updates = Updates.combine(
            Updates.set("TEN", user.getTenuser()),
            Updates.set("PASSWORD", user.getPassword()),
            Updates.set("GMAIL", user.getEmail()),
            Updates.set("ROLE", user.getRole())
        );

        // Thực hiện cập nhật tài liệu trong MongoDB
        UpdateResult result = usercollection.updateOne(filter, updates);

        // Kiểm tra xem có tài liệu nào bị ảnh hưởng không
        if (result.getMatchedCount() == 0) {
            throw new IllegalArgumentException("Không tìm thấy người dùng để cập nhật.");
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }     
}

public void deleteUser(String maUser) {
    Document query = new Document("MA_USER", maUser);
    usercollection.deleteOne(query);
}

public List<User> getAllUsersWithRole(String role) {
    List<User> users = new ArrayList<>();
    FindIterable<Document> documents = usercollection.find(Filters.eq("ROLE", role));

    for (Document doc : documents) {
        User user = new User();
        user.setMauser(doc.getString("MA_USER"));
        user.setTenuser(doc.getString("TEN"));
        user.setEmail(doc.getString("GMAIL"));
        user.setPassword(doc.getString("PASSWORD"));
        user.setRole(doc.getString("ROLE"));
        users.add(user);
    }
    return users;
}
public User getUserById(String maUser) {
    try {
        // Tạo truy vấn để tìm tài liệu người dùng dựa trên mã người dùng
        Bson filter = Filters.eq("MA_USER", maUser);

        // Tìm tài liệu người dùng trong MongoDB
        Document userDoc = usercollection.find(filter).first();
        
        // Nếu tìm thấy tài liệu, chuyển đổi thành đối tượng User
        if (userDoc != null) {
            User user = new User();
            user.setMauser(userDoc.getString("MA_USER"));
            user.setTenuser(userDoc.getString("TEN"));
            user.setPassword(userDoc.getString("PASSWORD"));
            user.setEmail(userDoc.getString("GMAIL"));
            user.setRole(userDoc.getString("ROLE"));
            return user;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}
public List<User> getUsersByEmail(String email) {
    List<User> users = new ArrayList<>();
    FindIterable<Document> documents = usercollection.find(Filters.regex("GMAIL", email, "i")); // Tìm kiếm không phân biệt chữ hoa chữ thường
    
    for (Document doc : documents) {
        User user = new User();
        user.setMauser(doc.getString("MA_USER"));
        user.setTenuser(doc.getString("TEN"));
        user.setEmail(doc.getString("GMAIL"));
        user.setPassword(doc.getString("PASSWORD"));
        user.setRole(doc.getString("ROLE"));
        users.add(user);
    }
    return users;
}


}
