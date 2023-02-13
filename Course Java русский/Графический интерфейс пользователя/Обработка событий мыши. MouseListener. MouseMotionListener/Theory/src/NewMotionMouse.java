import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class NewMotionMouse {
    static JFrame frame = new JFrame();
    static JPanel panel = new JPanel();//создаем панель

    public static void changeCursor(MouseEvent e){//метод изменения курсора
        panel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    public static void defaultCursor(MouseEvent e){//метод возврата курсора к дефолтному
        panel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }

    public static void main(String[] args) {
        int width = 800, height = 600;
    frame.setTitle("Cursor");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);
        frame.add(panel);
        panel.setFocusable(true);
        panel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e)
            {
                changeCursor(e);
            }
        });
        panel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                changeCursor(e);
            }
        });
    }
}
