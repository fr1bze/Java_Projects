import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Task extends JLabel implements ActionListener
{
  int deltaX = 2;
  int deltaY = 3;
  int directionX = 1;
  int directionY = 1;

  public Task(
          int startX, int startY,
          int deltaX, int deltaY,
          int directionX, int directionY,
          int delay)
  {
    this.deltaX = deltaX;
    this.deltaY = deltaY;
    this.directionX = directionX;
    this.directionY = directionY;

    setIcon(new ImageIcon("/Users/mikhail/Desktop/Unknown.png"));
    setSize( getPreferredSize() );
    setLocation(startX, startY);
    new javax.swing.Timer(delay, this).start();
  }

  public void actionPerformed(ActionEvent e)
  {
    Container parent = getParent();

    //  Determine next X position

    int nextX = getLocation().x + (deltaX * directionX);

    //  Determine next Y position

    int nextY = getLocation().y + (deltaY * directionY);

    if (getX() > getWidth() || getY() > getHeight())
    {
      nextX = 30;
      nextY = 200;
    }

    //  Move the label

    setLocation(nextX, nextY);
  }

  public static void main(String[] args)
  {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();

    frame.setContentPane(panel);
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.getContentPane().setLayout(null);
    frame.getContentPane().add( new Task(30, 200, 3, 5, 1, -1, 10) );
    frame.setSize(400, 400);
    frame.setLocationRelativeTo( null );
    frame.setVisible(true);
  }
}