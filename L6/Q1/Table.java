import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Table {
    static final String DB_URL = "jdbc:mysql://localhost/Users";
    static final String USER = "root";
    static final String PASS = "1234";
    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            String sql = "CREATE TABLE Users " +
                    "(U_code INTEGER not NULL, " +
                    " U_name VARCHAR(20), " +
                    " Email VARCHAR(30), " +
                    " Pass Varchar(15), " +
                    " Age Integer," +
                    " Degree varchar(20))";

            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}