import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class calc implements ActionListener
{
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ba,bs,bm,bdi,bdo,be,bc;
    JTextField t;
    double a,b,r;
    int op=0;
    calc()
    {
        f=new JFrame("Calculator");
        t=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        ba=new JButton("+");
        bs=new JButton("-");
        bm=new JButton("x");
        bdi=new JButton("/");
        be=new JButton("=");
        bc=new JButton("clear");
        bdo=new JButton(".");
        f.setLayout(null);
        f.setVisible(true);
        f.setBounds(50,50,350,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setBounds(30,50,275,20);
        f.add(t);
        b7.setBounds(40,100,50,40);
        f.add(b7);
        b8.setBounds(110,100,50,40);
        f.add(b8);
        b9.setBounds(180,100,50,40);
        f.add(b9);
        bdi.setBounds(250,100,50,40);
        f.add(bdi);
        b4.setBounds(40,170,50,40);
        f.add(b4);
        b5.setBounds(110,170,50,40);
        f.add(b5);
        b6.setBounds(180,170,50,40);
        f.add(b6);
        bm.setBounds(250,170,50,40);
        f.add(bm);
        b1.setBounds(40,240,50,40);
        f.add(b1);
        b2.setBounds(110,240,50,40);
        f.add(b2);
        b3.setBounds(180,240,50,40);
        f.add(b3);
        bs.setBounds(250,240,50,40);
        f.add(bs);
        b0.setBounds(40,310,50,40);
        f.add(b0);
        bdo.setBounds(110,310,50,40);
        f.add(bdo);
        be.setBounds(180,310,50,40);
        f.add(be);
        ba.setBounds(250,310,50,40);
        f.add(ba);
        bc.setBounds(100,380,100,40);
        f.add(bc);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bdi.addActionListener(this);
        bdo.addActionListener(this);
        be.addActionListener(this);
        bc.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            t.setText(t.getText().concat("1"));
        }
        if(e.getSource()==b2)
        {
            t.setText(t.getText().concat("2"));
        }
        if(e.getSource()==b3)
        {
            t.setText(t.getText().concat("3"));
        }
        if(e.getSource()==b4)
        {
            t.setText(t.getText().concat("4"));
        }
        if(e.getSource()==b5)
        {
            t.setText(t.getText().concat("5"));
        }
        if(e.getSource()==b6)
        {
            t.setText(t.getText().concat("6"));
        }
        if(e.getSource()==b7)
        {
            t.setText(t.getText().concat("7"));
        }
        if(e.getSource()==b8)
        {
            t.setText(t.getText().concat("8"));
        }
        if(e.getSource()==b9)
        {
            t.setText(t.getText().concat("9"));
        }
        if(e.getSource()==b0)
        {
            t.setText(t.getText().concat("0"));
        }
        if(e.getSource()==bdo)
        {
            t.setText(t.getText().concat("."));
        }
        if(e.getSource()==ba)
        {
            a=Double.parseDouble(t.getText());
            op=1;
            t.setText(null);
        }
        if(e.getSource()==bs)
        {
            a=Double.parseDouble(t.getText());
            op=2;
            t.setText(null);
        }
        if(e.getSource()==bm)
        {
            a=Double.parseDouble(t.getText());
            op=3;
            t.setText(null);
        }
        if(e.getSource()==bdi)
        {
            a=Double.parseDouble(t.getText());
            op=4;
            t.setText(null);
        }
        if(e.getSource()==be)
        {
            b=Double.parseDouble(t.getText());
            switch(op)
            {
                case 1:r=a+b;
                        break;
                case 2:r=a-b;
                        break;
                case 3:r=a*b;
                        break;
                case 4:r=a/b;
                        break;
            }
            t.setText(""+r);   
        }
        if(e.getSource()==bc)
        {
            t.setText(null);
        }
    }
}
public class calcT
{
    public static void main(String[] args)
    {
        calc c=new calc();
    }
}
