import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class MotionOfObject {
    public static void main(String[] args)
    {
        MyFrame frame = new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Movement of Figures");
        setSize(800,600);
        MyPanel panel = new MyPanel();
        Container pane = getContentPane();
        pane.add(panel);
    }
}

class MyPanel extends Panel {
    private ArrayList<Ellipse2D> circle;
    private Ellipse2D current;
    public MyPanel()
    {
        circle = new ArrayList<Ellipse2D>();
        current = null;
        addMouseListener(new MyMouse());
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < circle.size(); ++i)
        {
            g2.fill((Ellipse2D) circle.get(i));
            g2.setColor(new Color((20*i+ 100)));
        }
    }

    public void add(Point2D p)
    {
        current = new Ellipse2D.Double(p.getX(),p.getY(), 30,30);
        circle.add(current);
        repaint();
    }
    class MyMouse extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            add(e.getPoint());
            System.out.println("Кнопка нажата!");
        }
    }
}

