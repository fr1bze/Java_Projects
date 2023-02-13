import org.json.JSONObject;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Images extends JFrame {
    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();
    private final JButton catButton = new JButton("Cat");
    private final JButton dogButton = new JButton("Dog");
    private final JButton foxButton = new JButton("Fox");
    private final JLabel label = new JLabel();

        Images() {
        super("Animals");
        actionListeners();
        frame.add(panel);
        //frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(new Dimension(800,600));
        catButton.setPreferredSize(new Dimension(50,20));
        dogButton.setPreferredSize(new Dimension(50,20));
        foxButton.setPreferredSize(new Dimension(50,20));
        panel.add(label);
        frame.add(panel);
        panel.add(catButton);
        panel.add(dogButton);
        panel.add(foxButton);
        }

        void actionListeners() {
        catButton.addActionListener(e -> {
        try {
        setImage(getCat());
        } catch (URISyntaxException | IOException | InterruptedException ex) {
        throw new RuntimeException(ex);
        }
        });
        dogButton.addActionListener(e -> {
        try {
        setImage(getDog());
        } catch (URISyntaxException | IOException | InterruptedException ex) {
        throw new RuntimeException(ex);
        }
        });
        foxButton.addActionListener(e -> {
        try {
        setImage(getFox());
        } catch (URISyntaxException | IOException | InterruptedException ex) {
        throw new RuntimeException(ex);
        }
        });
        }

        void setImage(String URL) throws IOException {
        Image image = ImageIO.read(new URL(URL)).getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        label.setIcon(new ImageIcon(image));

        }

        String getCat() throws URISyntaxException, IOException, InterruptedException {
        return "https://cataas.com" + getImage("https://cataas.com/cat?json=true", "url");
        }

        String getDog() throws URISyntaxException, IOException, InterruptedException {
        return getImage("https://dog.ceo/api/breeds/image/random", "message");
        }

        String getFox() throws URISyntaxException, IOException, InterruptedException {
        return getImage("https://randomfox.ca/floof/", "image");
        }

        String getImage(String url, String key) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(url)).GET().build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        JSONObject obj = new JSONObject(response.body());
        return (String) obj.get(key);
        }

public static void main(String[] args) throws IOException {
        new Images();
        }
}