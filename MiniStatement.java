package asimulatorsystem;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener{
 
    JButton b1, b2;
    JLabel l1,l24;
    MiniStatement(String pin){
        super("Mini Statement");
        setTitle("PassBook");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("BANK_LOGO.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l24 = new JLabel(i3);
        l24.setBounds(149, 0, 100, 89);
        getContentPane().add(l24);
        
        getContentPane().setFont(new Font("Liberation Serif", Font.BOLD, 16));
        getContentPane().setBackground(Color.WHITE);
        setSize(400,600);
        setLocation(20,20);
        
        
        l1 = new JLabel();
        l1.setFont(new Font("Liberation Serif", Font.BOLD, 14));
        getContentPane().add(l1);
        
        JLabel l3 = new JLabel();
        l3.setBounds(20, 80, 300, 20);
        getContentPane().add(l3);
        
        JLabel l4 = new JLabel();
        l4.setFont(new Font("Liberation Serif", Font.BOLD, 15));
        l4.setBounds(20, 400, 300, 20);
        getContentPane().add(l4);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where pin = '"+pin+"'");
            while(rs.next()){
                l3.setText("Card Number:    " + rs.getString("cardno").substring(0, 4) + "XXXXXXXX" + rs.getString("cardno").substring(12));
            }
        }catch(Exception e){}
        	 
        try{
            int balance = 0;
            Conn c1  = new Conn();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM bank where pin = '"+pin+"'");
            while(rs.next()){
                l1.setText(l1.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("mode") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("mode").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            l4.setText("Your total Balance is Rs "+balance);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        getContentPane().setLayout(null);
        b1 = new JButton("Exit");
        getContentPane().add(b1);
        
        b1.addActionListener(this);
        
        l1.setBounds(12, 101, 380, 287);
        b1.setBounds(20, 500, 100, 25);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String[] args){
        new MiniStatement("").setVisible(true);
    }
    
}