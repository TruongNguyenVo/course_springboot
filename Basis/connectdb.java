package Basis;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// mysql
// host:sql.freedb.tech
// port: 3306
// database_name: freedb_java_course_springboot
// database_user: freedb_lammai
// database_password:?kkSAKhRdAxrk6!

// sqlsever
//localhost
//port :1433
// user: sa
// pass:123456789
public class connectdb {
    public static void main(String[] args) throws SQLException {
        final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=ContactDB;encrypt=false";
        final String USER = "sa";
        final String PASS = "123456789";
        Connection conn = null;
        Statement stmt = null;
        ArrayList<person> listPerson = new ArrayList<person>();
        try {
            // Step 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Step 2: Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connect successful!");
            
            // Step 3: Execute a query
            stmt = conn.createStatement();
            String sql = "select ContactID, FirstName, LastName from tblContacts";
            ResultSet rs = stmt.executeQuery(sql);

            // Step 4: Extract data from result set
            while(rs.next()){
                int id = rs.getInt("ContactID");
                String first_name = rs.getString("FirstName");
                String last_name = rs.getString("LastName");

                person temp = new person(id, first_name, last_name);
                listPerson.add(temp);
            }

            for (person user : listPerson) {
                System.out.println(user);
            }
            // Step 5: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            if(stmt != null) stmt.close();
            if(conn != null) conn.close();

        }
    }
}
