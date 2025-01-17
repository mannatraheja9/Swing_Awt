import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AddSwing extends JFrame implements ActionListener {
    JTextField tf1,tf2 ;
    AddSwing() {

        JLabel l1 = new JLabel("Number 1");
        l1.setBounds(40, 50, 70, 40);
        add(l1);
        JLabel l2 = new JLabel("Number 2");
        l2.setBounds(40, 90, 70, 40);
        add(l2);

        tf1 = new JTextField();
        tf1.setBounds(120, 50, 200, 30);
        add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(120, 100, 200, 30);
        add(tf2);

        JButton b = new JButton("ADD");
        b.setBounds(120, 160, 100, 30);
        add(b);

        b.addActionListener(this);

        setLayout(null);
        setSize(500,300);
        setLocation(500,200);
        setVisible(true);
        setTitle("Add Numbers");
    }

    public void actionPerformed(ActionEvent e) {

        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());
        int Result = num1 + num2 ;
        JOptionPane.showMessageDialog(null, Result);
    }
    public static void main(String args[]) {
        new AddSwing();
    }
}
