package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    JButton view, add, update, remove;
    
    Home() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/i7.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 630);
        add(image);
        
        JLabel h = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        h.setBounds(150, 290, 600, 30);
        h.setFont(new Font("Serif", Font.BOLD, 30));
        h.setForeground(Color.BLACK);
        image.add(h);
        
        add = new JButton("Add Employee");
        add.setBounds(850, 180, 150, 40);
        add.setBackground(Color.YELLOW);
        add.setForeground(Color.BLACK);
        add.addActionListener(this);
        add(add);
        
        view = new JButton("View Employees");
        view.setBounds(850, 240, 150, 40);
        view.setBackground(Color.YELLOW);
        view.setForeground(Color.BLACK);
        view.addActionListener(this);
        add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(850, 300, 150, 40);
        update.setBackground(Color.YELLOW);
        update.setForeground(Color.BLACK);
        update.addActionListener(this);
        add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(850, 360, 150, 40);
        remove.setBackground(Color.YELLOW);
        remove.setForeground(Color.BLACK);
        remove.addActionListener(this);
        add(remove);
        
        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
      
       
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new DeleteEmployee();
        }
    }

    public static void main(String[] args) {
        
        new Home();
    }
}
