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
    static final String QUERY = "SELECT id, name, Entry, Avg FROM unistd";
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
        ) {
            ResultSet rs = stmt.executeQuery(QUERY);
            while(rs.next()){
                //Display values
                System.out.print("ID: " + rs.getString("id"));
                System.out.print(", name: " + rs.getString("name"));
                System.out.print(", Entry: " + rs.getInt("Entry"));
                System.out.print(", Avg: " + rs.getDouble("Avg"));
            }
            rs.close();
            String sql,func,sotoon,WNTD,value;
            Scanner sc = new Scanner(System.in);
            System.out.println("che kari mikhahid anjam dahid ? (Update , Delete)");
            func = sc.nextLine();
            System.out.println("nam e sotoon ra vared konid : ");
            sotoon = sc.nextLine();
            System.out.println("nam e dadeyi ke mikhahid taghyir dahid ra vared konid : ");
            WNTD = sc.nextLine();

            switch (func){
                case "Update" :
                    System.out.println("dadeye jadid ra vared konid : ");
                    value = sc.nextLine();

                    sql = "UPDATE UNISTD SET " + sotoon + " = " + value + " WHERE " + sotoon + " = " +  WNTD +";";
                    break;
                case "Delete" :
                    sql = "DELETE FROM UNISTD WHERE " + sotoon + " = " + WNTD + ";";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}