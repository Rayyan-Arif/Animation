import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EarthAroundSun extends JPanel implements ActionListener{
    Image space;
    Image earth;
    int x=1100 , y=300;
    int centerX = 700 , centerY = 300;
    double angle = 0;
    int xVelocity = 1 , yVelocity = 1;
    Timer timer;
    EarthAroundSun()
    {
        this.setPreferredSize(new Dimension(900,600));
        space = new ImageIcon("sun.jpg").getImage();
        earth = new ImageIcon("earth.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paintComponent(Graphics g) { 
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(space, 0, 0, getWidth(), getHeight(), this);
        g2D.drawImage(earth,x,y , 100,100 , this);
    }

    public void actionPerformed(ActionEvent e)
    {
        angle += 0.01;  
        if (angle >= 2 * Math.PI) 
        {
            angle = 0;
        }
    
        x = (int)(centerX + 250 * Math.cos(angle));
        y = (int)(centerY + 250 * Math.sin(angle));
        repaint();
    }
}