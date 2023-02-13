import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Task extends JFrame {

  private int width = 300;
  private int height = 300;

  private Image img = new ImageIcon("/Users/mikhail/Desktop/Unknown.png").getImage();

  public Task() {
    setSize(width, height);
    setTitle("File Monitor:D");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    setVisible(true);

  }


  public void drawIcon() {
    Graphics g = getGraphics();
    g.drawImage(img, 0, 0, null);
  }
}