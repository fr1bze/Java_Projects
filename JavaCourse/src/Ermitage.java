import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Ermitage extends JFrame {
    private final JFrame frame = new JFrame();
    private final JLabel label = new JLabel();
    private final JPanel panel = new JPanel();
    Ermitage() throws IOException {
        String URL = "https://static-maps.yandex.ru/1.x/?ll=30.314566,59.939864&size=600,450&z=15&l=map";
        Image image = ImageIO.read(new URL(URL));
        label.setIcon(new ImageIcon(image));
        frame.setTitle("Ermitage");
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(new Dimension(600,400));
        frame.setVisible(true);

    }
    public static void main (String[] args) throws IOException {
        new Ermitage();
    }
}
