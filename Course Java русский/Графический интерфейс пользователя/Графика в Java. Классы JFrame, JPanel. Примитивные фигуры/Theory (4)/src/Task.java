//
//import javax.swing.*;
//import java.awt.*;
//
//// класс рисования двух типов фигур с текстом
//class Figure extends JComponent
//{
//  private static final long serialVersionUID = 1L;
//  private Color color;
//  private int type;
//
//  // параметры: цвет и тип фигуры
//  Figure(Color color, int type) {
//    this.color = color;
//    this.type = type;
//    setOpaque(false);
//  }
//  public void paintComponent(Graphics g) {
//    // прорисовка фигуры
//    g.setColor(color);
//    switch (type) {
//      case 0: g.fillOval(10, 0, 90, 90); break;
//      case 1: g.fillRect(10, 0, 90, 90); break;
//      case 2: g.fillRoundRect(0,0,110,350,20,20);
//      case 3: g.fillArc(0,0,85,23,0,180); g.fillArc(20,0,85,23,0,180); break;
//      case 4: g.fillRoundRect(0,0,45,65,10,10);
//      case 5: g.fillArc(0,0, 90,30, 0,180);
//    }
//    g.setColor(Color.yellow);
//  }
//}
//public class Task extends JFrame
//{
//  private static final long serialVersionUID = 1L;
//
//  public Task()
//  {
//    // создание окна
//    super("Example LayeredTest");
//    // выход при закрытии окна
//    setDefaultCloseOperation(EXIT_ON_CLOSE);
//    // определение многослойной панели
//    JLayeredPane lp = getLayeredPane();
//    // создание фигур
//    Figure figure1 = new Figure(Color.red , 0);
//    Figure figure2 = new Figure(Color.yellow, 0);
//    Figure figure3 = new Figure(Color.green, 0);
//    Figure figure4 = new Figure(Color.DARK_GRAY,2);
//    Figure figure5 = new Figure(Color.white,3);
//    Figure figure6 = new Figure(Color.white,3);
//    Figure figure7 = new Figure(Color.white,3);
//    Figure figure8 =new Figure(Color.DARK_GRAY,4);
//    Figure figure9 = new Figure(Color.DARK_GRAY,5);
//
//
//    // определение местоположения фигур в окне
//    figure1.setBounds(330, 75, 120, 120);
//    figure2.setBounds(330, 185, 120, 120);
//    figure3.setBounds(330, 295, 120, 120);
//    figure4.setBounds(330,55,250, 350);
//    figure5.setBounds(332,57,200,20);
//    figure6.setBounds(332,280,200,20);
//    figure7.setBounds(332,169,200,20);
//    figure8.setBounds(360, 430,44,64);
//    figure9.setBounds(340,30,90, 100);
//
//    // добавление фигур в различные слои
//    lp.add(figure1, JLayeredPane.PALETTE_LAYER);
//    lp.add(figure2, JLayeredPane.PALETTE_LAYER);
//    lp.add(figure3, JLayeredPane.PALETTE_LAYER);
//    lp.add(figure4,JLayeredPane.PALETTE_LAYER);
//    lp.add(figure5, JLayeredPane.POPUP_LAYER);
//    lp.add(figure6, JLayeredPane.POPUP_LAYER);
//    lp.add(figure7, JLayeredPane.POPUP_LAYER);
//    lp.add(figure8, JLayeredPane.PALETTE_LAYER);
//    lp.add(figure9, JLayeredPane.POPUP_LAYER);
//
//    // смена позиции одной из фигур
//    //lp.setPosition(figure3, 0);
//    // определение размера и открытие окна
//    setSize(800, 600);
//    setVisible(true);
//  }
//  public static void main(String[] args)
//  {
//    JFrame.setDefaultLookAndFeelDecorated(true);
//    new Task();
//  }
//}
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


class MyFrame extends JFrame {

  MyFrame() {
    MyPanel panel = new MyPanel();
    this.setSize(600, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Traffic Light");
    this.add(panel);
    this.pack();
    this.setVisible(true);
  }

}

class MyPanel extends JPanel {

  MyPanel() {
    this.setPreferredSize(new Dimension(600,600));

  }

  public void paint(Graphics g) {

    Graphics2D g2D = (Graphics2D) g;

    //Drawing background
    g2D.setColor(Color.LIGHT_GRAY);
    g2D.fillRect(0, 0, 600, 600);

    //Drawing main thing
    g2D.setColor(Color.DARK_GRAY);
    g2D.fillRoundRect(250, 100, 100, 360, 40, 40);
    g2D.fillRoundRect(275, 470, 50, 65, 20, 20);
    g2D.fillArc(270, 80, 60, 30, 0, 180);

    //Drawing lights
    g2D.setColor(Color.red);
    g2D.fillOval(265, 140, 70, 70);
    g2D.setColor(Color.yellow);
    g2D.fillOval(265, 250, 70, 70);
    g2D.setColor(Color.green);
    g2D.fillOval(265, 360, 70, 70);

    //Drawing thing near TrafficLight
    g2D.setColor(Color.DARK_GRAY);
    this.paintThing(240, 140, true, g);
    this.paintThing(240, 250, true, g);
    this.paintThing(240, 360, true, g);
    this.paintThing(360, 140, false, g);
    this.paintThing(360, 250, false, g);
    this.paintThing(360, 360, false, g);

    //Drawing white things
    g2D.setColor(Color.white);
    Area area = new Area(new Ellipse2D.Double(260, 115, 80, 80));
    Area temp = new Area(new Ellipse2D.Double(260, 130, 80, 80));
    area.subtract(temp);
    g2D.fill(area);

    area = new Area(new Ellipse2D.Double(260, 225, 80, 80));
    temp = new Area(new Ellipse2D.Double(260, 240, 80, 80));
    area.subtract(temp);
    g2D.fill(area);

    area = new Area(new Ellipse2D.Double(260, 335, 80, 80));
    temp = new Area(new Ellipse2D.Double(260, 350, 80, 80));
    area.subtract(temp);
    g2D.fill(area);
  }

  //Drawing thing near TrafficLight, if true - turns triangle to the left
  public void paintThing(int x, int y, boolean isLeft, Graphics g) {

    Graphics2D g2D = (Graphics2D) g;
    if (isLeft) {
      g2D.fillOval(x - 20, y, 20, 20);
      g2D.fillOval(x - 55, y, 20, 20);
      g2D.fillOval(x - 20, y + 36, 20, 20);
      Polygon p = new Polygon();
      p.addPoint(x - 10, y);
      p.addPoint(x - 45, y);
      p.addPoint(x - 53, y + 17);
      p.addPoint(x - 17, y + 53);
      p.addPoint(x, y + 45);
      p.addPoint(x, y + 10);
      g2D.fillPolygon(p);
    } else {
      g2D.fillOval(x, y, 20, 20);
      g2D.fillOval(x + 36, y, 20, 20);
      g2D.fillOval(x, y + 36, 20, 20);
      Polygon p = new Polygon();
      p.addPoint(x + 10, y);
      p.addPoint(x + 45, y);
      p.addPoint(x + 53, y + 17);
      p.addPoint(x + 17, y + 53);
      p.addPoint(x, y + 45);
      p.addPoint(x, y + 10);
      g2D.fillPolygon(p);
    }

  }
}
public class Task {

  public static void main(String[] args) {

    MyFrame frame = new MyFrame();

  }



}