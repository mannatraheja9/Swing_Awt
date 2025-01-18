//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.*;
//import java.net.*;
//import org.apache.commons.dbutils.DbUtils;
//
//public class EmpData extends JFrame {
//    JTable table;
//    public EmpData() {
//
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//
//        table = new JTable();
//
//        JLabel heading = new JLabel("Employee Details");
//        heading.setBounds(100,15,250,35);
//        heading.setFont(new Font("Tahoma", Font.ITALIC, 32));
//        heading.setForeground(Color.BLACK);
//        add(heading);
//
//        try {
//            Conn conn = new Conn();
//            ResultSet rs = conn.s.executeQuery("select * from emp");
//            table.setModel(DbUtils.resultSetToTableModel(rs));
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//        JScrollPane jsp = new JScrollPane(table);
//        jsp.setBounds(0, 80, 400, 300);
//        add(jsp);
//        setSize(400, 300);
//        setLocation(200, 100);
//        setVisible(true);
//    }
//    public static void main(String[] args) {
//        new EmpData();
//    }
//}
