import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Main {
    static final String DB_URL = "jdbc:mysql://localhost/users";
    static final String USER = "root";
    static final String PASS = "1234";
    static final String QUERY = "SELECT id, name, N_id, F_name , Pos , Income , Exp FROM employees";
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            ResultSet rs = stmt.executeQuery(QUERY);
            while(rs.next()){
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", name: " + rs.getString("name"));
                System.out.print(", N_id: " + rs.getInt("N_id"));
                System.out.print(", F_name: " + rs.getString("F_name"));
                System.out.print(", Pos: " + rs.getString("Pos"));
                System.out.print(", Income: " + rs.getInt("Income"));
                System.out.println(", Exp: " + rs.getInt("Exp"));
            }
            rs.close();
            Scanner sc = new Scanner(System.in);
            System.out.println("ID mored nazar ra vared konid : ");
            int idnum = Integer.parseInt(sc.nextLine());
            String sql = "DELETE FROM employees " +
                    "WHERE id = " + idnum + ";";
            stmt.executeUpdate(sql);
            System.out.println("DONE!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}