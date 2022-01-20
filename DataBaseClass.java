import java.sql.*;

public class DataBaseClass {
    Connection c;
    Statement s;
    ResultSet rs;
    DataBaseClass(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","");
            
        }
        catch(SQLException e){
            System.out.println("SQL Exception");
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            System.out.println("Class Not Found");
            e.printStackTrace();
        }
    }

    public void showAll(){
        try{
            s = c.createStatement();
                rs = s.executeQuery("SELECT * FROM new_table");
                while(rs.next()){
                    System.out.println("name:"+rs.getString("name"));
                    System.out.println("age:"+rs.getInt("age"));
                }
                c.close();
        }catch(SQLException e){
            System.out.println("SQL Exception");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
       DataBaseClass dc =  new DataBaseClass(); 
        dc.showAll();
    }
}
