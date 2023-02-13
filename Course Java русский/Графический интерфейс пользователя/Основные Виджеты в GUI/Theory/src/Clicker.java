import javax.swing.*;
import java.awt.*;

public class Clicker {
    static int counter = 0;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Clicker");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300,500);
        JLabel label = new JLabel(Integer.toString(counter), SwingConstants.CENTER);
        label.setFont(new Font("Calibri", Font.BOLD, 50));
        frame.add(label);
        JButton button = new JButton("Click");
        JButton button1 = new JButton("Reset");
        button1.addActionListener(e->{counter = 0;label.setText(Integer.toString(counter));});
        button.addActionListener(e->label.setText(Integer.toString(++counter)));
        frame.add(button,BorderLayout.SOUTH);
        frame.add(button1,BorderLayout.NORTH);
        frame.setVisible(true);
    }
}
