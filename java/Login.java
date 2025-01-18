import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton submit;
    JTextField tfusername;
    JPasswordField tfpassword;

    public Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblLogin = new JLabel("Login Account");
        lblLogin.setBounds(150,15,250,60);
        lblLogin.setForeground(Color.BLACK);
        lblLogin.setFont(new Font("Tahoma",Font.BOLD,19));
        add(lblLogin);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(15,70,100,30);
        lblusername.setBackground(Color.BLACK);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(15,110,100,30);
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblpassword);

        tfusername = new JTextField();
        tfusername.setBounds(130,70,200,30);
        add(tfusername);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(130,110,200,30);
        add(tfpassword);

        submit = new JButton("Submit");
        submit.setBounds(150, 170, 100, 30);
        submit.addActionListener(this);
        add(submit);

        setSize(400, 320);
        setLocation(350, 150);
        setTitle("Login Account");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            int i = 0;
            try {
                Conn c = new Conn();
                String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
                ResultSet rs = c.s.executeQuery(query);

                while(rs.next()) {
                    if(username.equals(rs.getString(1)) && password.equals(rs.getString(2)) ) {
                        JOptionPane.showMessageDialog(null, "Login Successful");
                        i = 1;
                        break; } }
                if(i==0) {
                    JOptionPane.showMessageDialog(null, "Wrong username & password");
                } }
            catch (Exception e) {
                e.printStackTrace();}}
    }
    public static void main(String args[]){
        new Login();
    }
}
