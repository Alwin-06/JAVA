// File writing using GUI

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class gui implements ActionListener
{
    JFrame f;
    JButton b;
    JTextField t;
    JLabel l;

    gui()
    {
        f=new JFrame("GUI");
        b=new JButton("File");
        t=new JTextField();
        l=new JLabel("Enter the matter to be saved in file");
        f.setBounds(50,50,500,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setBounds(40,70,75,75);
        f.add(b);
        t.setBounds(40,40,200,25);
        f.add(t);
        l.setBounds(15,10,200,30);
        f.add(l);
        b.addActionListener(this);
        t.addActionListener(this);
    }
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==b)
            {
                String text=t.getText();
                try{
                    FileWriter file=new FileWriter("FILE");
                    file.write(text);
                    file.close();
                }
                catch(IOException ex)
                {
                    ex.printStackTrace();
                }
            }
        }
}

public class guifile {
    public static void main(String[] args)
    {
        gui g=new gui();
    }
}
