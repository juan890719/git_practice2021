package snowing;

import javax.swing.*;
import java.awt.*;

public class MainWin {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setLocation(400,200);
        JButton button1 = new JButton("Hello");
        JButton button2 = new JButton("Hello");
        JButton button3 = new JButton("Hello");
        JButton button4 = new JButton("Hello");
        JButton button5 = new JButton("Hello");
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.EAST);
        frame.add(button4, BorderLayout.WEST);
        frame.add(button5, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
