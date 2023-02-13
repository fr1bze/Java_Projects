import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.*;


public class Cities {
    public static void main(String[] args) throws IOException {
        ArrayList<String> cities = new ArrayList<>();

        int i = 0;
        String url = "https://www.krylatskoye.ru/content/ratings/2021/09/0928.html";
        Document document = Jsoup.connect(url).get();
        for (Element div : document.select("div.table_width")) {
            for (Element div2 : div.select("div.table_wrap")) {
                for (Element table : div2.select("td.left"))
                {
                    i++;
                    if (i%2 == 1 && i < 200) {
                        cities.add(table.text());
                    }
                }
            }
        }
        Collections.sort(cities);
        System.out.println(cities.size());
        cities.forEach((city) -> System.out.println(city));
    }
}