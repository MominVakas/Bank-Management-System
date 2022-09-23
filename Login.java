package asimulatorsystem;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3;
  
    Login(){
        setTitle("THE  BANK  OF ALI");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("BANK_LOGO.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(70, 10, 100, 100);
        getContentPane().add(l11);
        
        l1 = new JLabel("WELCOME TO ATM");
        l1.setFont(new Font("Liberation Serif", Font.BOLD, 40));
        l1.setBounds(200,40,450,40);
        getContentPane().add(l1);
        
        l2 = new JLabel("Card No:");
        l2.setFont(new Font("Liberation Serif", Font.BOLD, 30));
        l2.setBounds(125,150,375,30);
        getContentPane().add(l2);
        
        tf1 = new JTextField(15);
        tf1.setBounds(300,150,230,30);
        tf1.setFont(new Font("Liberation Serif", Font.BOLD, 18));
        getContentPane().add(tf1);
        
        l3 = new JLabel("PIN:");
        l3.setFont(new Font("Liberation Serif", Font.BOLD, 30));
        l3.setBounds(125,220,375,30);
        getContentPane().add(l3);
        
        pf2 = new JPasswordField(15);
        pf2.setFont(new Font("Liberation Serif", Font.BOLD, 18));
        pf2.setBounds(300,220,230,30);
        getContentPane().add(pf2);
                
        b1 = new JButton("SIGN IN");
        b1.setBackground(new Color(255, 204, 102));
        b1.setForeground(new Color(0, 0, 0));
        
        b2 = new JButton("CLEAR");
        b2.setBackground(new Color(255, 204, 102));
        b2.setForeground(new Color(0, 0, 0));
        
        b3 = new JButton("SIGN UP");
        b3.setBackground(new Color(255, 204, 102));
        b3.setForeground(new Color(0, 0, 0));
        
        getContentPane().setLayout(null);
        
        b1.setFont(new Font("Liberation Serif", Font.BOLD, 16));
        b1.setBounds(300,300,100,30);
        getContentPane().add(b1);
        
        b2.setFont(new Font("Liberation Serif", Font.BOLD, 16));
        b2.setBounds(430,300,100,30);
        getContentPane().add(b2);
        
        b3.setFont(new Font("Liberation Serif", Font.BOLD, 16));
        b3.setBounds(300,350,230,30);
        getContentPane().add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        setLocation(550,200);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        try{        
            if(ae.getSource()==b1){
                Conn c1 = new Conn();
                String cardno  = tf1.getText();
                String pin  = pf2.getText();
                String q  = "select * from login where cardno = '"+cardno+"' and pin = '"+pin+"'";

                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }else if(ae.getSource()==b2){
                tf1.setText("");
                pf2.setText("");
            }else if(ae.getSource()==b3){
                setVisible(false);
                new Signup().setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Login().setVisible(true);
    }

    
}


