import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;


public class Task {
  static JLayeredPane panel = new JLayeredPane();
  static public void add(MouseEvent e)
  {
    if (e.getButton() == 1)
    {
      JLabel label = new JLabel("Coord X:"+e.getX()+" Coord Y:"+e.getY());
      label.setBounds(e.getX(),e.getY(),160,15);
      panel.add(label);
    }
  }


  public static void main(String[] args) {
    JFrame frame = new JFrame();
    int width = 800, height = 600;
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension dim = toolkit.getScreenSize();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);
    frame.setTitle("Mouse Listener");
    panel.setFocusable(true);
    frame.add(panel);
    frame.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        add(e);
      }
    });

  }
}


