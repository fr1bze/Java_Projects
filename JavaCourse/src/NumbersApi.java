
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class NumbersApi extends JFrame {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JButton button = new JButton();
    private JTextArea textArea = new JTextArea();

    NumbersApi() {

        super("This day in History");
        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);

        button.addActionListener(e -> {
            try {
                HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://numbersapi.com/" + datePicker.getModel().getMonth() + "/" + datePicker.getModel().getDay() + "/date")).GET().build();
                HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
                textArea.setText(response.body());
            } catch (URISyntaxException | IOException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
        textArea.setPreferredSize(new Dimension(100,100));
        panel.add(datePicker);
        panel.add(button);
        panel.add(textArea);
        frame.add(panel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main (String[] args)
    {
        new NumbersApi();
    }
}



//public class NumbersApi {
//    public static void main(String[] args) throws java.net.URISyntaxException, IOException, InterruptedException {
//        int n = 5;
//        HttpRequest request = HttpRequest.newBuilder().uri(new URI("http://jservice.io/api/random?count=" + n)).GET().build();
//        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        String jsonString = response.body().toString();
//        System.out.println(jsonString);
//        JSONArray array = new JSONArray(jsonString);
//        for (int i = 0; i < n; i++){
//            JSONObject obj = array.getJSONObject(i);
//            String answer = (String) obj.get("answer");
//            String question = (String) obj.get("question");
//            System.out.println(question + " - " + answer);
//        }
//    }
//}