import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Insert {
    static final String DB_URL = "jdbc:mysql://localhost/users";
    static final String USER = "root";
    static final String PASS = "1234";
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO UNISTD VALUES (39912341054001, 'Zara',1399, 18.5)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO UNISTD VALUES (39912341054002, 'Mahnaz', 1399, 19.3)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO UNISTD VALUES (39912341054003, 'Zaid', 1399, 14.8)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO UNISTD VALUES(39912341054004, 'Sumit', 1399, 17.8)";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}