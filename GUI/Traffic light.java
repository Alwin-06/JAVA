import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TrafficLight extends JPanel implements ActionListener {
    JRadioButton r1, r2, r3;                 // Radio button for red,green,yellow light
    Color red_c, green_c, yellow_c;           // Color for red,green,yellow

    public TrafficLight()
    {
        setBounds(0, 0, 680, 450);       //Set the size of the panel
    
        //Create the radio buttons
        r1=new JRadioButton("Red");
        r2=new JRadioButton("Green");
        r3=new JRadioButton("Yellow");

        add(r1);                             // Add the radio buttons to the panel
        add(r2);
        add(r3);

        ButtonGroup g = new ButtonGroup();    // Create a button group to ensure that only one radio button can be selected at a time

        r1.setSelected(true);                //set the red radio button as selected by default
        g.add(r1);                           // Add radio buttons to the radio group
        g.add(r2);
        g.add(r3);

        r1.addActionListener(this);          //Add a action listener to the radio buttons
        r2.addActionListener(this);
        r3.addActionListener(this);

        // Set initial colors
        red_c = Color.red;
        yellow_c = Color.yellow;
        green_c = Color.green;
    }

    public void actionPerformed(ActionEvent e) {
        // Update colors based on selected radio button
        if (r1.isSelected()==true) {
            red_c = Color.red;
            green_c = getBackground();
            yellow_c = getBackground();
        }
        else if (r2.isSelected()==true) {
            yellow_c = Color.yellow;
            red_c = getBackground();
            green_c = getBackground();
        }

        if (r3.isSelected()==true) {
            green_c = Color.green;
            red_c = getBackground();
            yellow_c = getBackground();
        }

        repaint();    // Repaint the panel to show the updated traffic light
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw and fill ovals with respective colors
        g.drawOval(320, 50, 50, 50);
        g.setColor(red_c);
        g.fillOval(320, 50, 50, 50);

        g.drawOval(320, 140, 50, 50);
        g.setColor(yellow_c);
        g.fillOval(320, 140, 50, 50);

        g.drawOval(320, 230, 50, 50);
        g.setColor(green_c);
        g.fillOval(320, 230, 50, 50);
    }
}

public class TrafficLightTest {
    public static void main(String[] args) {
        JFrame f = new JFrame();                        // Create a new JFrame
        f.setLayout(null);                              // Disable the default
        f.setVisible(true);                             // Make the JFrame visible
        f.setSize(680, 450);                            // Set the size of JFrame
        f.setTitle("Traffic Light");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TrafficLight t = new TrafficLight();
        f.add(t);
    }
}
