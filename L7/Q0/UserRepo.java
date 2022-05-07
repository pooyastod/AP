import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class UserRepo implements AutoCloseable {
    static final String DB_URL = "jdbc:mysql://localhost/users";
    static final String USER = "root";
    static final String PASS = "1234";
    private Connection connection;
    private PreparedStatement preparedStatement;
    public UserRepo() throws Exception{
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
    }
    public void Insert(UserEnti userEnti) throws Exception {
        preparedStatement = connection.prepareStatement("insert into USERS (UserName,Pass,Name,Email) values (?,?,?,?)");
        preparedStatement.setString(1,userEnti.getUserName());
        preparedStatement.setString(2,userEnti.getPass());
        preparedStatement.setString(3,userEnti.getName());
        preparedStatement.setString(4,userEnti.getEmail());
        preparedStatement.executeUpdate();
    }
    public List<UserEnti> select() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT UserName , Pass FROM USERS ");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<UserEnti> userEntiList=new ArrayList<>();
        while (resultSet.next ()){
            UserEnti userEnti=new UserEnti();
            userEnti.setUserName(resultSet.getString ("UserName"));
            userEnti.setPass(resultSet.getString("Pass"));
            userEntiList.add (userEnti);
        }
        return userEntiList;
    }
    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }
    public void commit() throws Exception{
        connection.commit ();
    }
}

