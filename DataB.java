import java.sql.*;

public class DataB {
    Connection con;
    Statement st;
    PreparedStatement prst;
    ResultSet rs;

    DataB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","");
            System.out.println("Connected");
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

  
    public static void main(String[] args) {
        new DataB();
    }
  

}
