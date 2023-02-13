import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Triangle extends JFrame {
    private final JFrame frame = new JFrame();
    private final JLabel label = new JLabel();
    private final JPanel panel = new JPanel();
    Triangle() throws IOException {
        String miami = "-80.277787,25.798434";
        String puertoRicko = "-66.006578,18.435282";
        String URL = "https://static-maps.yandex.ru/1.x/?ll=-69.846484,26.728948&z=5&l=map&pl="+miami+","+puertoRicko+","+"-64.701123,32.359881,"+miami;
        Image image = ImageIO.read(new URL(URL));
        label.setIcon(new ImageIcon(image));
        frame.setTitle("Bermuda Triangle");
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(new Dimension(800,600));
        frame.setVisible(true);

    }
    public static void main (String[] args) throws IOException {
        new Triangle();
    }
}

