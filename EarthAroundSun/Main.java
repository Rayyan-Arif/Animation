import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main {

    Main()
    {
        JFrame frame = new JFrame("Earth Revolving Around The Sun");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EarthAroundSun space = new EarthAroundSun();
        frame.setLayout(new BorderLayout());
        frame.setSize(1920,1080);
        frame.add(space);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
