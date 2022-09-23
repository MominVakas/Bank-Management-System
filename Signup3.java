
package asimulatorsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno;
    Signup3(String formno){
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("BANK_LOGO.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        getContentPane().add(l14);
        
        l1 = new JLabel("Page 3: Account Details");
        l1.setForeground(new Color(0, 0, 0));
        l1.setFont(new Font("Liberation Serif", Font.BOLD, 26));
        
        l2 = new JLabel("Account Type:");
        l2.setFont(new Font("Liberation Serif", Font.BOLD, 20));
        
        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Liberation Serif", Font.BOLD, 20));
        
        l4 = new JLabel("XXXX-XXXX-XXXX-4184");
        l4.setFont(new Font("Liberation Serif", Font.BOLD, 19));
        
        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setFont(new Font("Liberation Serif", Font.BOLD, 14));
        
        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setFont(new Font("Liberation Serif", Font.BOLD, 14));
        
        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Liberation Serif", Font.BOLD, 20));
        
        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Liberation Serif", Font.BOLD, 20));
    
        l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("Liberation Serif", Font.BOLD, 14));
    
        l10 = new JLabel("Services Required:");
        l10.setFont(new Font("Liberation Serif", Font.BOLD, 20));
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Liberation Serif", Font.BOLD, 22));
        b1.setBackground(new Color(255, 204, 102));
        b1.setForeground(new Color(0, 0, 0));
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Liberation Serif", Font.BOLD, 22));
        b2.setBackground(new Color(255, 204, 102));
        b2.setForeground(new Color(0, 0, 0));
        
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Liberation Serif", Font.BOLD, 17));
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Liberation Serif", Font.BOLD, 17));
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Liberation Serif", Font.BOLD, 17));
        
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Liberation Serif", Font.BOLD, 17));
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Liberation Serif", Font.BOLD, 17));
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Liberation Serif", Font.BOLD, 17));
        
        c7 = new JCheckBox("I hereby declare that all the information submitted by me in the application form is correct, true and valid. ",true);
        c7.setForeground(new Color(255, 51, 0));
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Liberation Serif", Font.BOLD, 14));
         
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Liberation Serif", Font.BOLD, 17));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Liberation Serif", Font.BOLD, 17));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Liberation Serif", Font.BOLD, 17));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Liberation Serif", Font.BOLD, 17));
        r4.setBackground(Color.WHITE);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        groupgender.add(r3);
        groupgender.add(r4);
        
        getContentPane().setLayout(null);
        
        l1.setBounds(280,40,400,40);
        getContentPane().add(l1); 
        
        l2.setBounds(100,140,200,30);
        getContentPane().add(l2);
        
        r1.setBounds(100,180,176,30);
        getContentPane().add(r1);
        
        r2.setBounds(350,180,300,30);
        getContentPane().add(r2);
        
        r3.setBounds(100,220,250,30);
        getContentPane().add(r3);
        
        r4.setBounds(350,220,250,30);
        getContentPane().add(r4);
        
        l3.setBounds(100,300,200,30);
        getContentPane().add(l3);
        
        l4.setBounds(330,300,250,30);
        getContentPane().add(l4);
        
        l5.setBounds(100,330,200,20);
        getContentPane().add(l5);
        
        l6.setBounds(330,330,500,20);
        getContentPane().add(l6);
        
        l7.setBounds(100,370,200,30);
        getContentPane().add(l7);
        
        l8.setBounds(330,370,200,30);
        getContentPane().add(l8);
        
        l9.setBounds(100,400,200,20);
        getContentPane().add(l9);
        
        l10.setBounds(100,450,200,30);
        getContentPane().add(l10);
        
        c1.setBounds(100,500,200,30);
        getContentPane().add(c1);
        
        c2.setBounds(350,500,200,30);
        getContentPane().add(c2);
        
        c3.setBounds(100,550,200,30);
        getContentPane().add(c3);
        
        c4.setBounds(350,550,200,30);
        getContentPane().add(c4);
        
        c5.setBounds(100,600,200,30);
        getContentPane().add(c5);
        
        c6.setBounds(350,600,200,30);
        getContentPane().add(c6);
        
        c7.setBounds(38,647,692,52);
        getContentPane().add(c7);
        
        b1.setBounds(250,720,119,30);
        getContentPane().add(b1);
        
        b2.setBounds(420,720,119,30);
        getContentPane().add(b2);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850);
        setLocation(500,120);
        setVisible(true);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String atype = null;
        if(r1.isSelected()){ 
            atype = "Saving Account";
        }
        else if(r2.isSelected()){ 
            atype = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){ 
            atype = "Current Account";
        }else if(r4.isSelected()){ 
            atype = "Recurring Deposit Account";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
        String facility = "";
        if(c1.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(c2.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(c3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(c4.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(c5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(c6.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        try{
            if(ae.getSource()==b1){
                
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";  
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pin);
                    
                    new Deposit(pin).setVisible(true);
                    setVisible(false);
                }
            
            }else if(ae.getSource()==b2){
                System.exit(0);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Signup3("").setVisible(true);
    }
    
}

