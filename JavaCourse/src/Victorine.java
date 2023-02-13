import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;

public class Victorine {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        int n = 8;
        HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://jservice.io/api/random?count=" + n)).GET().build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        String jsonString = response.body().toString();
        JSONArray array = new JSONArray(jsonString);
        int cnt = 0;
        ArrayList<String> question = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            JSONObject obj = array.getJSONObject(i);
            answer.add((String) obj.get("answer"));
            System.out.println((String) obj.get("answer"));
            question.add((String) obj.get("question"));
        }
        int index = 0;
        for (String que: question
             ) {
            System.out.println(que);
            String ans = sc.nextLine();
            if (ans.equals(answer.get(index)))
                cnt++;
            index++;
        }
        System.out.println("Your result is: "  + cnt + "/8");
    }
}
