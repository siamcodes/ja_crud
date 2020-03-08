package java_crud;
import java.sql.*;

public class MainInsert {

    public static void main(String[] args) {
      DBConnect db = new DBConnect("root","root");  //username, password
      String sql = "INSERT INTO movies(title, description) VALUES('ผู้หญิงข้าใครอย่าแตะ', 'หนังฮ่องกง')";
     try{
      db.connect();
      ResultSet rs = db.getStatement().executeQuery(sql); 
      System.out.println("Record Inserted Successfully");
     }catch(Exception e){
          e.printStackTrace();
      }
    }
    
}
