import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;

public class VictorineWinterface extends JFrame {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JTextField textField = new JTextField();
    private JButton button = new JButton();
    private JTextArea textArea = new JTextArea();
    private int counter = 0;
    private int numberQuestion = 0;
    private int n = 8;
    ArrayList<String> answers = new ArrayList<>();
    ArrayList<String> questions = new ArrayList<>();

    VictorineWinterface() throws URISyntaxException, IOException, InterruptedException {
        super("Викторина");
        HttpRequest request = HttpRequest.newBuilder().uri(new URI("http://jservice.io/api/random?count="+n)).GET().build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        String jsonString = response.body();
        JSONArray array = new JSONArray(jsonString);
        for (int i = 0; i < n; i++) {
            JSONObject obj = array.getJSONObject(i);
            answers.add((String) obj.get("answer"));
            questions.add((String) obj.get("question"));
        }
        textArea.setText("Question 1: " + questions.get(0) + "?" + " (" + answers.get(0) + ")");
        button.addActionListener(e -> next());
        button.setText("Reply");
        textArea.setPreferredSize(new Dimension(600,50));
        textArea.setLineWrap(true);
        textField.setPreferredSize(new Dimension(200,30));
        panel.add(button);
        panel.add(textArea);
        panel.add(textField);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void next() {
        String choice = textField.getText();
        if (choice.equals(answers.get(numberQuestion))) counter++;
        textField.setText("");
        if (numberQuestion == 7) {
            JOptionPane.showMessageDialog(frame,"Вы ответили верно на " + counter + " из 8 вопросов");
            return;
        }
        numberQuestion++;
        textArea.setText("Question " + (numberQuestion + 1) + ": " + questions.get(numberQuestion) + "?" + " (" + answers.get(numberQuestion) + ")");
    }

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        new VictorineWinterface();
    }
}
