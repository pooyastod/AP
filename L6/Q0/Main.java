import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost/karmandha";
    static final String USER = "root";
    static final String PASS = "1234";
    static final String QUERY = "SELECT name, pass, username, email FROM employees";


    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter username : ");
            String username = sc.nextLine();
            ResultSet rs = stmt.executeQuery(QUERY);
            System.out.println("Enter password : ");
            String pass = sc.nextLine();
            String sql = "SELECT * FROM employees" +
                    " WHERE username ='" + username + "' and pass='" + pass + "';";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
               System.out.println("You got logged in");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
