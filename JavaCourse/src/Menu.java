import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Menu {
    public static void main(String[] args) throws IOException {
        String url = "https://dominodomoy.ru/catalog/";
        Document document = Jsoup.connect(url).get();
        Elements categories = document.getElementsByClass("catalog-section-list-item-title");
        for (Element div : categories) {
            System.out.println("Раздел: " + div.text());
            Document detailCategory = Jsoup.connect("https://dominodomoy.ru" + div.attr("href")).get();
            Elements positions = detailCategory.getElementsByClass("catalog-section-item-background");
                for (Element position : positions) {
                    String name = position.getElementsByClass("catalog-section-item-name-wrapper").text();
                    String price = position.getElementsByClass("catalog-section-item-price-discount").text();
                    String image = position.select("img").attr("data-original");
                    System.out.println(name + " " + price + " " + ": https://dominodomoy.ru" + image);
                }
        }
    }
}
