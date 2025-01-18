import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener {
    JTextField tf1,tf2 ;

    LoginForm() {
        JLabel l1 = new JLabel("UserName");
        l1.setBounds(40, 50, 70, 40);
        add(l1);
        JLabel l2 = new JLabel("Password");
        l2.setBounds(40, 90, 70, 40);
        add(l2);

        tf1 = new JTextField();
        tf1.setBounds(120, 50, 200, 30);
        add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(120, 100, 200, 30);
        add(tf2);

        JButton b = new JButton("Login");
        b.setBounds(120, 160, 100, 30);
        b.addActionListener(this);
        add(b);

        setLayout(null);
        setSize(400,300);
        setLocation(500,200);
        setVisible(true);
        setTitle("Login Form");
    }

    public void actionPerformed(ActionEvent e) {
        String username = tf1.getText();
        String password = tf2.getText();
        try {
            if (username.equals("Mannat") && password.equals("12345")) {
                JOptionPane.showMessageDialog(null, "Login Successful");
            }
            else {
                JOptionPane.showMessageDialog(null, "Login Failure");
            }
        }catch(Exception e1){
            e1.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new LoginForm();        }     }
