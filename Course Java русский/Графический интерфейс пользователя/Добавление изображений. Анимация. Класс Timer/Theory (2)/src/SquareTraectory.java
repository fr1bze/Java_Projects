import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SquareTraectory extends JLabel implements ActionListener
{
    int startX;
    int startY;
    int deltaX;
    int deltaY;
    int delay;

    public SquareTraectory(int startX, int startY, int deltaX, int deltaY
            , int delay)
    {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.startX = startX;
        this.startY = startY;
        this.delay = delay;

        setIcon(new ImageIcon("/Users/mikhail/Desktop/Unknown.png"));
        setSize(getPreferredSize());
        setLocation(startX, startY);
        new javax.swing.Timer(delay, this).start();
    }
    static int i = 0;
    public void actionPerformed(ActionEvent e)
    {
        Container container = getParent();
        int nextX = getX();
        int nextY = getY();
        if (nextY > 0 && nextY < 800 && i <= startY/deltaY) {
            nextY -= deltaY;
            i++;
            System.out.println(i + " Up");
        }
        else if (nextX > 0 && nextX < 600 && i <=startY/deltaY) {
            nextX += deltaX;
            System.out.println("Right");
        }
        else if (nextY < 800 && nextY >= 0 && i >= startY/deltaY && i <=2*startY/deltaY ) {
            i++;
            nextY += deltaY;
            System.out.println(i + " Down");
        }
        else if (nextX < 800 && nextX >= 0 && i >= 2*startY/deltaY ) {
            i++;
            nextX -= deltaX;
            System.out.println(i + " Left");
        }

        //  Move the label
        setLocation(nextX, nextY);
    }

    public static void main(String[] args)
    {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setContentPane(panel);
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add( new SquareTraectory(50, 500, 4, 4, 10) );



    }
}