import java.sql.*;
import javax.sql.rowset.*;

public class RowSetTest {
    RowSetTest(){
        try{
            RowSetFactory rowSetFactory = RowSetProvider.newFactory();
            JdbcRowSet rs = rowSetFactory.createJdbcRowSet();
            Class.forName("com.mysql.jdbc.Driver");
            rs.setUrl("jdbc:mysql://localhost:3306/test_db");
            rs.setUsername("root");
            rs.setPassword("");
            rs.setCommand("SELECT * FROM new_table");
            rs.execute();

            while(rs.next()){
                System.out.println("name:"+rs.getString("name"));
                System.out.println("age:"+rs.getInt("age"));
            }

        }catch(Exception e){    
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new RowSetTest();
    }
}
