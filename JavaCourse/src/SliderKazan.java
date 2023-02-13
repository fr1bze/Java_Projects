import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class SliderKazan extends JFrame {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JSlider slider= new JSlider(0, 20, 1);
    JLabel label = new JLabel();
    JLabel textArea = new JLabel();
    SliderKazan() throws IOException {

        frame.setTitle("KazanScope");
    }

    private void addGUI()
    {
        slider.setPreferredSize(new Dimension(200,20));
        label.setPreferredSize(new Dimension(600,500));
        textArea.setPreferredSize(new Dimension(150,20));
        panel.add(textArea);
        panel.add(label);
        panel.add(slider);
        frame.add(panel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(new Dimension(800,600));
        frame.setVisible(true);
    }

    private void setImage()
    {
        slider.addChangeListener(e -> {
            String URL = "https://static-maps.yandex.ru/1.x/?ll=49.106615,55.802438&z="+slider.getValue()+"&l=map";
            try {
                Image image = ImageIO.read(new URL(URL));
                label.setIcon(new ImageIcon(image));
                textArea.setText("Current zoom is: " + String.valueOf(slider.getValue()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    public void run()
    {
        setImage();
        addGUI();
    }

    public static void main (String[] args) throws IOException {
        new SliderKazan().run();
    }
}
