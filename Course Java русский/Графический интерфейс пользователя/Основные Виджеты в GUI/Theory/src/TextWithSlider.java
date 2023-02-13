import javax.swing.*;
import java.awt.*;

public class TextWithSlider {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Title");
        JPanel panel = new JPanel();
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 5, 105, 50);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        JLabel label = new JLabel("Моя первая надпись!",SwingConstants.CENTER);
        label.setFont(new Font("Calibri", Font.ITALIC, 50));
        slider.addChangeListener(e -> label.setFont(new Font("Calibri", Font.ITALIC, slider.getValue())));
        frame.add(label);
        frame.add(slider, BorderLayout.SOUTH);
        frame.setVisible(true);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(dim.width,dim.height);
        frame.setLocationRelativeTo(null);

    }
}