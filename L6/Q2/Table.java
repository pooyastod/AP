import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Table {
    static final String DB_URL = "jdbc:mysql://localhost/users";
    static final String USER = "root";
    static final String PASS = "1234";
    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            String sql = "CREATE TABLE employees " +
                    "(id INTEGER not NULL, " +
                    " Name VARCHAR(255), " +
                    " N_id integer, " +
                    " F_name Varchar(20), " +
                    " Pos VARCHAR(20)," +
                    " Income Integer," +
                    " Exp integer," +
                    " PRIMARY KEY ( id ))";

            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}