package Connect;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBUtil {
	 private static MongoClient mongoClient = null;
	 private static MongoDatabase database = null;
	 private static final String DATABASE_NAME = "QUANLIWEBDAOCU";
	 
	  // Kết nối đến MongoDB
	 public static void connect() {
	        if (mongoClient == null) {
	            mongoClient = MongoClients.create("mongodb://localhost:27017");
	            database = mongoClient.getDatabase(DATABASE_NAME);
	        }
	    }
	 
	// Đóng kết nối MongoDB
	    public static void disconnect() {
	        if (mongoClient != null) {
	            mongoClient.close();
	            mongoClient = null;
	            database = null;
	        }
	    }
	    
	 // Lấy đối tượng MongoDatabase
	    public static MongoDatabase getDatabase() {
	        if (database == null) {
	            connect();
	        }
	        return database;
	    }
}
