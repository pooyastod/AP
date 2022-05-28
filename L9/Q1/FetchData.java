import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class FetchData implements ActionListener,Runnable  {
    JFrame frame1;
    JButton fetchButton;
    JFrame frame2;
    DefaultTableModel defaultTableModel;
    JTable table;
    Connection connection;
    Statement statement;
    int flag=0;
    FetchData() {
        frame1 = new JFrame();
        frame1.setTitle("Search Database");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout bagLayout = new GridBagLayout();
        GridBagConstraints bagConstraints = new GridBagConstraints();
        frame1.setSize(500, 300);
        frame1.setLayout(bagLayout);
        bagConstraints.insets = new Insets(15, 40, 0, 0);
        fetchButton = new JButton("Fetch Data");
        bagConstraints.gridx = 0;
        bagConstraints.gridy = 1;
        bagConstraints.ipadx = 60;
        frame1.add(fetchButton, bagConstraints);
        fetchButton.addActionListener(this);
        frame1.setVisible(true);
        frame1.validate();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fetchButton) {
            String userName = "";
            frameSecond(userName);
        }
    }
    public void frameSecond(String userName) {
        frame2 = new JFrame("Database Results");
        frame2.setLayout(new FlowLayout());
        frame2.setSize(400, 400);
        defaultTableModel = new DefaultTableModel();
        table = new JTable(defaultTableModel);
        table.setPreferredScrollableViewportSize(new Dimension(300, 100));
        table.setFillsViewportHeight(true);
        frame2.add(new JScrollPane(table));
        defaultTableModel.addColumn("Username");
        defaultTableModel.addColumn("passwrd");
        defaultTableModel.addColumn("Email");
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "1234");
            statement = connection.createStatement();
            String query = "select * from employees;";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String name = resultSet.getString("USERNAME");
                String roll = resultSet.getString("passwrd");
                String dept = resultSet.getString("email");
                    defaultTableModel.addRow(new Object[]{name, roll, dept});
                    frame2.setVisible(true);
                    frame2.validate();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @Override
    public void run() {
        new FetchData();
    }
}