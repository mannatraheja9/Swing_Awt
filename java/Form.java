import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Form extends JFrame implements ActionListener {
    JLabel name,age,gen,lang;
    JTextField tfn,tfa,tfl;
    JButton b;
    JRadioButton m,f;

    Form() {

        name = new JLabel("Enter Name");
        name.setBounds(40, 50, 70, 25);
        add(name);

        age = new JLabel("Enter Age");
        age.setBounds(40, 100, 70, 25);
        add(age);

        gen = new JLabel("Enter Gender");
        gen.setBounds(40, 150, 120, 25);
        add(gen);

        lang = new JLabel("Enter Languages");
        lang.setBounds(40, 200, 120, 25);
        add(lang);

        tfn = new JTextField();
        tfn.setBounds(150, 50, 120, 25);
        add(tfn);

        tfa = new JTextField();
        tfa.setBounds(150, 100, 120, 25);
        add(tfa);

        m=new JRadioButton("Male");
        m.setBounds(150, 150, 70, 40);
        add(m);

        f=new JRadioButton("Female");
        f.setBounds(250, 150, 70, 40);
        add(f);

        ButtonGroup bg=new ButtonGroup();
        bg.add(m);
        bg.add(f);

        tfl = new JTextField();
        tfl.setBounds(150, 200, 120, 25);
        add(tfl);

        b = new JButton("Display");
        b.setBounds(170, 250, 120, 25);
        b.addActionListener(this);
        add(b);

        setLayout(null);
        setSize(500,400);
        setLocation(500,200);
        setVisible(true);
        setTitle("Form");
    }

    public void actionPerformed(ActionEvent e) {
        String name = tfn.getText();
        String age =  tfa.getText();
        String lang =  tfl.getText();
        String gen = (m.isSelected())? "Mr." : "Ms.";
        JOptionPane.showMessageDialog(null,"Hello "+gen+name+" you are the expert in " + lang);
    }

    public static void main(String args[]) {
        new Form();
    }
}
