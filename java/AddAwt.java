import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AddAwt implements ActionListener {
    TextField tf1,tf2 ;

    AddAwt() {
        Frame f = new Frame("Add Number");
        Label l1 = new Label("Number 1");
        Label l2 = new Label("Number 2");
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        Button res = new Button("Add");

        f.add(l1);
        f.add(l2);
        f.add(tf1);
        f.add(tf2);
        f.add(res);

        res.addActionListener(this);
        f.setLayout(new FlowLayout());
        f.setSize(700,200);
        f.setLocation(500,300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());
        int result=num1 + num2;
        JOptionPane.showMessageDialog(null, result);
    }

    public static void main(String args[]) {
        new AddAwt();
    }
}
