import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class exa implements ActionListener
{
    JFrame f;
    JButton b;
    JTextField t;
    JLabel l;
    exa()
    {
        f=new JFrame("Page");
        b=new JButton("Login");
        t=new JTextField();
        l=new JLabel("Enter the name");
        f.setLayout(null);
        f.setVisible(true);
        f.setBounds(50,50,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setBounds(100,100,250,20);
        f.add(t);
        b.setBounds(250,250,100,80);
        f.add(b);
        l.setBounds(50,50,100,30);
        f.add(l);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            JFrame f=new JFrame("Next Page");
            JLabel l=new JLabel("Logged Successfully");
            f.setLayout(null);
            f.setVisible(true);
            f.setBounds(50,50,500,500);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            l.setBounds(50,50,150,30);
            f.add(l);
        }
    }
}

public class guiexample2 {
    public static void main(String[] args)
    {
        exa x=new exa();
    }
}
