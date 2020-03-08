package java_crud;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
      DBConnect db = new DBConnect("root","root");  //username, password
      String sql = "SELECT * FROM movies";
      
      try{
          db.connect();
          ResultSet rs = db.getStatement().executeQuery(sql);   
          while(rs.next()){
              String title = rs.getString("title");
              String description = rs.getString("description");
              System.out.println();
              System.out.println("ชื่อหนัง: "+ title);
              System.out.println("รายละเอียดย่อ"+ description);
              System.out.println("----------------------------");
          }
          
      }catch(SQLException se){
         se.printStackTrace();
      }catch(Exception e){
          e.printStackTrace();
      }
      
    }
}
