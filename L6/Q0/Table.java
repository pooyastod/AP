import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Table {
    static final String DB_URL = "jdbc:mysql://localhost/Database";
    static final String USER = "root";
    static final String PASS = "1234";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            String Table_creation = "CREATE TABLE Employees " +
                    "(name varchar(30), " +
                    " pass VARCHAR(15), " +
                    " Username VARCHAR(30), " +
                    " email varchar(200))";
            stmt.executeUpdate(Table_creation);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}