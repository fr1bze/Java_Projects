import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;




class Conn {
    public String url;
    Conn(String url)
    {
        this.url = url;
    }
    public void connect() throws IOException, InterruptedException {
        Document document = Jsoup.connect(this.url).get();
        Elements categories = document.getElementsByClass("div.iva-item-slider-pYwHo");
        for (Element div : categories) {
            for(Element a: div.select("a.iva-item-sliderLink-uLz1v")) {
                Thread.sleep(100);
                System.out.println(a);
            }
        }
    }
}

public class UlaParse {


    public static void main(String[] args) throws IOException, InterruptedException {
        Conn con = new Conn("https://www.avito.ru/moskva/avtomobili/audi-ASgBAgICAUTgtg3elyg?cd=1");
        con.connect();
    }
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Dimension dim =toolkit.getScreenSize();
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
//        frame.setPreferredSize(dim);
//        frame.setSize(dim);
//        frame.setTitle("Joula parsing");
//        JPanel panel = new JPanel();
//        JButton search = new JButton("Find");
//
//        Object[][] data = {{0, "2016.04.05", "68.6753", "78.1662","2016.04.05", "68.6753", "78.1662" },
//                {1, "2016.04.06", "68.8901", "78.2798","2016.04.05", "68.6753", "78.1662" },
//                {2, "2016.04.07", "68.5215", "78.1662","2016.04.05", "68.6753", "78.1662" }};
//        Object[] columnNames = {"id","Name", "Price", "City", "Seller","Link","Created at"};
//        JTable table = new JTable(data,columnNames);
//        JScrollPane scroll = new JScrollPane();
//        scroll.setPreferredSize(new Dimension(500,400));
//        // Размещение таблицы в панели прокрутки
//        table.setPreferredSize(new Dimension(dim.width, dim.height));
//        JTextField field = new JTextField();
//        field.setPreferredSize(new Dimension(1000,30));
//        panel.add(field);
//        panel.add(scroll);
//        panel.add(search);
//        panel.add(table);
//        frame.add(panel);
//        frame.setVisible(true);
//    }
}
