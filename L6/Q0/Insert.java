import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    static final String DB_URL = "jdbc:mysql://localhost/karmandha";
    static final String USER = "root";
    static final String PASS = "1234";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            // Execute a query
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO employees VALUES ('ali aliyani', '12345', 'alialiyani', 'alialiyani@gmail.com')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO employees VALUES ('mhmd mhmdi', '123456', 'mhmdmhmdi', 'mhmdmhmdi@gmail.com')";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}