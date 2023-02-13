import javax.swing.*;
import java.awt.*;

public class Text {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Title");
        JLabel label = new JLabel("Моя первая надпись!, SwingConstants.CENTER");
        label.setFont(new Font("Calibri", Font.ITALIC, 50));
        frame.add(label);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        frame.setVisible(true);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(dim.width,dim.height);
        frame.setLocationRelativeTo(null);

    }
}
