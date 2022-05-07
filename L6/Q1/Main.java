import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost/users";
    static final String USER = "root";
    static final String PASS = "1234";
    static final String QUERY = "SELECT U_code, U_name, email, pass , Age , Degree FROM Users";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
        ) {
            Scanner Sc = new Scanner(System.in);
            System.out.println("Che chizi ra mikhahid avaz konid ? ");
            String CH = Sc.nextLine();
            String sql = " ";
            String sanavie = " ";
            String avvalie = " ";
            ArrayList<String> info;
            switch (CH) {
                case "U_code": {
                    System.out.println("code e jadid ra vared konid : ");
                    sanavie = Sc.nextLine();
                    System.out.println("code e ghadim ra vared konid");
                    avvalie = Sc.nextLine();
                    sql = "UPDATE Users SET U_code = '" + sanavie + "' WHERE U_code = '" + avvalie + "';";
                    break;
                }
                case "U_name": {
                    System.out.println("nam e jadid ra vared konid : ");
                    sanavie = Sc.nextLine();
                    System.out.println("nam e ghadim ra vared konid");
                    avvalie = Sc.nextLine();
                    sql = "UPDATE Users SET U_name = '" + sanavie + "' WHERE U_name = '" + avvalie + "';";
                    break;
                }
                case "Email": {
                    System.out.println("Email e jadid ra vared konid : ");
                    sanavie = Sc.nextLine();
                    System.out.println("Email e ghadim ra vared konid");
                    avvalie = Sc.nextLine();
                    sql = "UPDATE Users SET Email = '" + sanavie + "' WHERE Email = '" + avvalie + "';";
                    break;
                }
                case "Pass": {
                    System.out.println("password e jadid ra vared konid : ");
                    sanavie = Sc.nextLine();
                    System.out.println("password e ghadim ra vared konid");
                    avvalie = Sc.nextLine();
                    sql = "UPDATE Users SET pass = '" + sanavie + "' WHERE pass = '" + avvalie + "';";
                    break;
                }
                case "Age": {
                    System.out.println("sen e jadid ra vared konid : ");
                    sanavie = Sc.nextLine();
                    System.out.println("sen e ghadim ra vared konid");
                    avvalie = Sc.nextLine();
                    sql = "UPDATE Users SET Age = '" + sanavie + "' WHERE Age = '" + avvalie + "';";
                    break;
                }
                case "Degree": {
                    System.out.println("Degree e jadid ra vared konid : ");
                    sanavie = Sc.nextLine();
                    System.out.println("Degree e ghadim ra vared konid");
                    avvalie = Sc.nextLine();
                    sql = "UPDATE Users SET Degree = '" + sanavie + "' WHERE Degree = '" + avvalie + "';";
                    break;
                }
            }
            stmt.executeUpdate(sql);
        }
    }
}