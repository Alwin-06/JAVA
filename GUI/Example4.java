/* Write a java program a simple user form which reads the name of a user and mail id in Text fields, select gender with radio buttons and also enters address in a text area. After filling details whenever a user press the submit button then displays all the information about the user input. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class detail implements ActionListener
{
    JFrame f;
    JButton b;
    JTextField t1,t2;
    JRadioButton r1,r2;
    JTextArea a;
    JLabel l1,l2,l3,l4;
    
    detail()
    {
        f=new JFrame("Login");

        b=new JButton("Submit");
        t1=new JTextField();
        t2=new JTextField();
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        a=new JTextArea();
        l1=new JLabel("Enter the name: ");
        l2=new JLabel("Enter the email: ");
        l3=new JLabel("Enter the address: ");
        l4=new JLabel("Gender: ");

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,450);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.setBounds(50,250,60,65);
        t1.setBounds(110,45,75,20);
        t2.setBounds(110,70,75,20);
        l1.setBounds(10,25,100,50);
        l2.setBounds(10,50,100,50);
        l3.setBounds(10,75,150,50);
        a.setBounds(130,100,75,75);
        l4.setBounds(10,180,100,50);
        r1.setBounds(150,200,125,25);
        r2.setBounds(300,200,125,25);

        f.add(b);
        f.add(t1);
        f.add(t2);
        f.add(r1);
        f.add(r2);
        f.add(a);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);

        ButtonGroup g=new ButtonGroup();
        g.add(r1);
        g.add(r2);

        b.addActionListener(this);
        r1.addActionListener(this);          
        r2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
        {

            if(e.getSource()==b)
            {
                JFrame f5=new JFrame("My Details");
                JLabel l5=new JLabel(t1.getText());
                JLabel l6=new JLabel(t2.getText());
                JLabel l7=new JLabel(a.getText());
                JLabel l8=new JLabel();
                if (r1.isSelected()==true) {
                    l8.setText("Male");
                }
                else if (r2.isSelected()==true) {
                    l8.setText("Female");
                }
                f5.setLayout(null);
                f5.setVisible(true);
                f5.setBounds(50,50,500,500);
                f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                l5.setBounds(50,50,150,30);
                l6.setBounds(50,90,150,30);
                l7.setBounds(50,150,150,30);
                l8.setBounds(50,200,150,30);
                f5.add(l5);
                f5.add(l6);
                f5.add(l7);
                f5.add(l8);
            }
        }
}


public class guiexample3 {
    public static void main(String[] args)
    {
        detail d=new detail();
    }
}
