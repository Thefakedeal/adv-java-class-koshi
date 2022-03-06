import java.sql.*;

public class DataBaseClass {
    Connection c;
    Statement s;
    ResultSet rs;
    PreparedStatement ps;
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

    public void showAll() throws SQLException{
        // try{
            s = c.createStatement();
                rs = s.executeQuery("SELECT * FROM new_table");
                while(rs.next()){
                    System.out.println("name:"+rs.getString("name"));
                    System.out.println("age:"+rs.getInt("age"));
                }
             
    }

    public void insertLast(String name, int age) throws SQLException{
        
        s =  c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        rs = s.executeQuery("SELECT * FROM new_table");
        rs.last();
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.updateInt("age", age);
        rs.insertRow();
    }
    

    public void updateNumber(String name, int age, int num) throws SQLException{
        
        s =  c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        rs = s.executeQuery("SELECT * FROM new_table");
        rs.absolute(num);
        rs.updateString("name", name);
        rs.updateInt("age", age);
        rs.updateRow();
    }
    

    public void insert(String name, int age) throws SQLException{
        
        ps =  c.prepareStatement("INSERT INTO new_table(name,age) VALUES(?,?)");
        ps.setString(1, name);
        ps.setInt(2, age);
        ps.executeUpdate();
        System.out.println("INSERTED");
    }
    

    public void update(String name, int age,int id) throws SQLException{
        
        ps =  c.prepareStatement("UPDATE new_table SET name=?,age=? WHERE id=?");
        ps.setString(1, name);
        ps.setInt(2, age);
        ps.setInt(3, id);
        ps.executeUpdate();
        System.out.println("ROW UPDATED");
    }

    public void delete(int id) throws SQLException{
        
        ps =  c.prepareStatement("DELETE FROM new_table WHERE id=?");
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("ROW UPDATED");
    }
    public static void main(String[] args) {
       DataBaseClass dc =  new DataBaseClass(); 
       try{
        //    dc.showAll();
        // dc.insert("Harry", 31);
        // dc.update("Sam", 50, 1);
        // dc.insertLast("Harry", 31);
        dc.updateNumber("Har", 312,2);
        // dc.delete(3);
       }catch(SQLException e){
        e.printStackTrace();
       }finally{
           try{
               dc.c.close();
           }catch(SQLException e){
               e.printStackTrace();
           }
       }
    }
}
