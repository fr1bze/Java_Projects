    import javax.imageio.ImageIO;
    import javax.swing.*;
    import java.awt.*;
    import java.io.IOException;
    import java.net.MalformedURLException;
    import java.net.URL;

    public class Smolensk extends JFrame {
        private final JFrame frame = new JFrame();
        private final JLabel label = new JLabel();
        private final JPanel panel = new JPanel();
        Smolensk() throws IOException {
            String URL = "https://static-maps.yandex.ru/1.x/?ll=32.039091,54.781830&z=17&l=map&" +
                    "pt=32.041901,54.780564,1" +
                    "~32.041703,54.780903,pmdos2" +
                    "~32.040027,54.781253,pm2vvm3" +
                    "~32.038424,54.782181,flag" +
                    "~32.038041,54.782746,ya_ru";
            Image image = ImageIO.read(new URL(URL));
            label.setIcon(new ImageIcon(image));
            frame.setTitle("Smolensk");
            panel.add(label);
            frame.add(panel);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setSize(new Dimension(800,600));
            frame.setVisible(true);

        }
        public static void main (String[] args) throws IOException {
            new Smolensk();
        }
    }

