import org.json.JSONArray;
import org.json.JSONObject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LastProject extends JFrame{
    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();
    private final JSlider slider= new JSlider(0, 20, 1);
    private final JLabel imageLabel = new JLabel();
    private final JTextArea find = new JTextArea();
    private final JButton search = new JButton();
    private JTextArea foundList = new JTextArea();
    private JTextArea info = new JTextArea();
    private List<String> coordinatesList;
    private String typeMap = "map";
    private  String longCoord;
    private String latCoord;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private final JCheckBox checkBox = new JCheckBox("Пробки");
    private final JRadioButton scheme = new JRadioButton("Схема");
    private final JRadioButton satelliteButton = new JRadioButton("Спутник");
    private JSONArray jsonArray = new JSONArray();
    private final String searchKey = "d0950524-df5d-48be-9f82-c5744056c892";
    private String objLink;


    LastProject() throws IOException {
        frame.setTitle("FindMap");
        buttonGroup.add(scheme);
        buttonGroup.add(satelliteButton);
        info.setLineWrap(true);
    }

    private void addGUI()
    {
        frame.setSize(new Dimension(600,1000));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setPreferredSize(new Dimension(900,700));
        imageLabel.setMaximumSize(new Dimension(500,400));
        find.setPreferredSize(new Dimension(400,20));
        panel.add(find);
        search.setText("Поиск");
        panel.add(search);
        info.setText("Здесь будет информация по найденному зданию");
        info.setPreferredSize(new Dimension(300,300));
        panel.add(imageLabel);
        panel.add(slider);
        foundList.setPreferredSize(new Dimension(300,300));
        panel.add(foundList);
        panel.add(info);
        panel.add(checkBox);
        panel.add(scheme);
        panel.add(satelliteButton);
        frame.add(panel);

    }

    public String getObjLink() {
        objLink = "https://search-maps.yandex.ru/v1/?lang=ru_RU&apikey=" + searchKey + "&text=" + find.getText().replace("\n", "+");
        return objLink;
    }

    private void find()  {//Поиск подходящей организации + отображение их списка в поле foundList

        find.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed (KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    HttpResponse<String> response = null;
                    try {
                        HttpRequest request = HttpRequest.newBuilder().uri(new URI(getObjLink())).GET().build();
                        response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
                    } catch (URISyntaxException | IOException | InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                    JSONObject jo = new JSONObject(response.body());
                    jsonArray = (JSONArray) jo.get("features");
                    System.out.println(jsonArray.length());
                }
            }
        });
        }
        public String[] setCoordinatesList() {
        String[] coords = new String[2];
        for (Object o : jsonArray) {
            JSONArray jaCoordinates = ((JSONObject) o).getJSONObject("geometry").getJSONArray("coordinates");
            coords[0] = jaCoordinates.get(0).toString();
            coords[1] = jaCoordinates.get(1).toString();
        }
        return coords;
    }
    private void setImage()
    {
        search.addActionListener(e -> {
            foundList.append(find.getText() + "\n");
            String URL = "https://static-maps.yandex.ru/1.x/?ll=" + setCoordinatesList()[0] + "," + setCoordinatesList()[1] + "&z=10&l="+typeMap;
            try {
                Image image = ImageIO.read(new URL(URL));
                imageLabel.setIcon(new ImageIcon(image));
                //textArea.setText("Current zoom is: " + String.valueOf(slider.getValue()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    private void setZoomValue()
    {
        String zoom = "10";
        slider.addChangeListener(e -> {
            String URL = "https://static-maps.yandex.ru/1.x/?ll=" + setCoordinatesList()[0] + "," + setCoordinatesList()[1] + "&z="+slider.getValue()+"&l="+typeMap;
            try {
                Image image = ImageIO.read(new URL(URL));
                imageLabel.setIcon(new ImageIcon(image));
                setInfo();
                //textArea.setText("Current zoom is: " + String.valueOf(slider.getValue()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    private void setInfo()
    {
            for (Object o : jsonArray) {
                JSONObject properties = ((JSONObject) o).getJSONObject("properties").getJSONObject("CompanyMetaData");

                    info.setText(properties.get("name").toString() + "\n" +
                            properties.get("address").toString() + "\n" +
                            properties.getJSONArray("Phones").getJSONObject(0).get("formatted") + ", "
                            + (properties.getJSONArray("Phones").getJSONObject(1).get("type").equals("phone") ? "Мобильный телефон" : "Неизвестный формат") + "\n" +
                            properties.getJSONArray("Categories").getJSONObject(0).get("name").toString() + "\n" +
                            properties.getJSONObject("Hours").get("text").toString());
                }
                //else info.setText("No information");
            }
    //}

    private void setSatelliteMapFlag() {
        satelliteButton.addActionListener(e -> {
            if (satelliteButton.isSelected()) {
                typeMap = "sat";
                String URL = "https://static-maps.yandex.ru/1.x/?ll=" + setCoordinatesList()[0] + "," + setCoordinatesList()[1] + "&z=10&l=" + typeMap;
                try {
                    Image image = ImageIO.read(new URL(URL));
                    imageLabel.setIcon(new ImageIcon(image));
                    //textArea.setText("Current zoom is: " + String.valueOf(slider.getValue()));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        scheme.addActionListener(e -> {
            if (scheme.isSelected()) {
                typeMap = "map";
                String URL = "https://static-maps.yandex.ru/1.x/?ll=" + setCoordinatesList()[0] + "," + setCoordinatesList()[1] + "&z=10&l=" + typeMap;
                try {
                    Image image = ImageIO.read(new URL(URL));
                    imageLabel.setIcon(new ImageIcon(image));
                    //textArea.setText("Current zoom is: " + String.valueOf(slider.getValue()));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
            checkBox.addActionListener(event->
            {
                if(checkBox.isSelected())
                {
                    String trf = "trf";
                    String URL = "https://static-maps.yandex.ru/1.x/?ll=" + setCoordinatesList()[0] + "," + setCoordinatesList()[1] + "&z=" + slider.getValue() +"&l=" + typeMap + "," + trf;
                    try {
                        Image image = ImageIO.read(new URL(URL));
                        imageLabel.setIcon(new ImageIcon(image));
                        //textArea.setText("Current zoom is: " + String.valueOf(slider.getValue()));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                else
                {
                    String URL = "https://static-maps.yandex.ru/1.x/?ll=" + setCoordinatesList()[0] + "," + setCoordinatesList()[1] + "&z=" + slider.getValue() +"&l=" + typeMap;
                    try {
                        Image image = ImageIO.read(new URL(URL));
                        imageLabel.setIcon(new ImageIcon(image));
                        //textArea.setText("Current zoom is: " + String.valueOf(slider.getValue()));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
    }


//        search.addActionListener(e -> {
//        });

//    private void setImage()
//    {
//        slider.addChangeListener(e -> {
//
//            String URL = "https://static-maps.yandex.ru/1.x/?ll="+ longCoord + latCoord +  "," + 54.781830+"&z=17&l="+map+"&  ";
//            try {
//                Image image = ImageIO.read(new URL(URL));
//                imageLabel.setIcon(new ImageIcon(image));
//                imageLabel.setText(String.valueOf(slider.getValue()));
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//    }

    private void run() throws IOException, URISyntaxException, InterruptedException {
        addGUI();
        find();
        setCoordinatesList();
        setImage();
        setZoomValue();
        setSatelliteMapFlag();
      //  setInfo();
    }

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        new LastProject().run();
    }
}
