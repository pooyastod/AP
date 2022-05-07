import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class CarRepo {
    static final String DB_URL = "jdbc:mysql://localhost/users";
    static final String USER = "root";
    static final String PASS = "1234";
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    public CarRepo() throws Exception {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
    }
    public void  update (CarUserEnt carUserEnt, CarEnt carEnt) throws Exception {
        preparedStatement = connection.prepareStatement(
                "update UserC set CAR=?,MONEY=? where USERNAME=?");
        preparedStatement.setInt(1,carEnt.getId());
        preparedStatement.setLong(2,carEnt.getPrice());
        preparedStatement.setString(3,carUserEnt.getUsername());
        preparedStatement.executeUpdate();
    }
    public List<String> selectUserC (CarUserEnt carUserEnt, CarEnt carsEnt) throws Exception {
        preparedStatement = connection.prepareStatement(
                "select * from UserC where USERNAME =?");
        preparedStatement.setString(1,carUserEnt.getUsername());
        List <String> list = new ArrayList<String>();
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            list.add(resultSet.getString("Userid"));
            list.add(resultSet.getString("Username"));
            list.add(resultSet.getString("Pass"));
            list.add(resultSet.getString("Money"));
            list.add(resultSet.getString("Car"));
        }
        return list;
    }
    public List<String> selectCAR (CarUserEnt carUserEnt, CarEnt carsEnt) throws Exception {
        preparedStatement = connection.prepareStatement(
                "select * from CARS where Carid =?");
        preparedStatement.setInt(1,carsEnt.getId());
        List <String> list = new ArrayList<String>();
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            list.add(resultSet.getString("Carid"));
            list.add(resultSet.getString("CarName"));
            list.add(resultSet.getString("ProductY"));
            list.add(resultSet.getString("Price"));
        }
        return list;
    }
    public void commit () throws Exception {
        connection.commit();
    }
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }

}
