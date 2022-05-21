import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.EventObject;
import javax.swing.*;
import javax.swing.event.*;
public class MyPanel extends JPanel implements ActionListener {
    private static JButton login;
    private static JButton register;
    private JTextField luserx;
    private JTextField rnamex;
    private JTextField rpassx;
    private JTextField lemailx;
    private JLabel rname;
    private JLabel rpass;
    private JLabel ruser;
    private JLabel remail;
    private JLabel luser;
    private JLabel lpass;
    private JPasswordField lpassx;
    private JTextField ruserx;
    public MyPanel() {
        login = new JButton ("Login");
        register = new JButton ("Register");
        luserx = new JTextField (5);
        rnamex = new JTextField (1);
        rpassx = new JTextField (1);
        lemailx = new JTextField (1);
        rname = new JLabel ("Name");
        rpass = new JLabel ("PassWord");
        ruser = new JLabel ("UserName");
        remail = new JLabel ("Email");
        luser = new JLabel ("UserName");
        lpass = new JLabel ("PassWord");
        lpassx = new JPasswordField (5);
        ruserx = new JTextField (1);
        setPreferredSize (new Dimension (944, 557));
        setLayout (null);
        add (login);
        add (register);
        add (luserx);
        add (rnamex);
        add (rpassx);
        add (lemailx);
        add (rname);
        add (rpass);
        add (ruser);
        add (remail);
        add (luser);
        add (lpass);
        add (lpassx);
        add (ruserx);
        String rluserx = luserx.getText();
        String rlpassx = String.valueOf(lpassx.getPassword());
        String rruserx = ruserx.getText();
        String rrpassx = rpassx.getText();
        String rrnamex = rnamex.getText();
        String rremailx =remail.getText();
        login.setBounds (245, 270, 100, 25);
        register.setBounds (495, 275, 100, 25);
        luserx.setBounds (500, 210, 100, 25);
        rnamex.setBounds (500, 145, 100, 25);
        rpassx.setBounds (245, 215, 100, 25);
        lemailx.setBounds (500, 240, 100, 25);
        rname.setBounds (400, 145, 100, 25);
        rpass.setBounds (400, 180, 100, 25);
        ruser.setBounds (400, 210, 100, 25);
        remail.setBounds (400, 240, 100, 25);
        luser.setBounds (145, 175, 100, 25);
        lpass.setBounds (145, 215, 100, 25);
        lpassx.setBounds (500, 180, 100, 25);
        ruserx.setBounds (245, 175, 100, 25);
        login.addActionListener(this);
        register.addActionListener(this);
        @Override
        public void actionPerformed(ActionEvent e) {if (e.getSource() == login) {
                static final String DB_URL = "jdbc:mysql://localhost/karmandha";
                static final String USER = "root";
                static final String PASS = "1234";
                try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    Statement stmt = conn.createStatement();) {
                    PreparedStatement st = (PreparedStatement) conn.prepareStatement("Select name, password from users where name=? and password=?");
                    st.setString(1, rluserx);
                    st.setString(2, rlpassx);
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {JOptionPane.showMessageDialog(this, "Login Successful");
                    } else {
                        JOptionPane.showMessageDialog(this, "Wrong Username & Password");}}
            catch (SQLException e) {e.printStackTrace();}}
            if (e.getSource() == register) {
                static final String DB_URL = "jdbc:mysql://localhost/karmandha";
                static final String USER = "root";
                static final String PASS = "1234";
                try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    Statement stmt = conn.createStatement()) {
                    PreparedStatement st = (PreparedStatement) conn.prepareStatement("INSERT INTO users VALUES (?,?,?,?)";);
                    st.setString(1, rrnamex);
                    st.setString(2, rruserx);
                    st.setString(3, rrpassx);
                    st.setString(4, rremailx);
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "Login Successful");
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "register unsuccessfull");}
                    }}}}}
