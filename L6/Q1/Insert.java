import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    static final String DB_URL = "jdbc:mysql://localhost/users";
    static final String USER = "root";
    static final String PASS = "1234";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            // Execute a query
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO Users VALUES (1,'alialiyani','alialiyani@gmail.com','12345',20,'Diplom')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Users VALUES (2, 'mhmdmhmdi','mhmdmhmdi@gmail.com','123456',21,'Lisans')";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}