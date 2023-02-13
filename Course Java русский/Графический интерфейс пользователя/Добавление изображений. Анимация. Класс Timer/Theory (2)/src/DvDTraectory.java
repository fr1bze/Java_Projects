import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DvDTraectory extends JLabel implements ActionListener
{
    int deltaX = 2;
    int deltaY = 3;
    int directionX = 1;
    int directionY = 1;

    public DvDTraectory(
            int startX, int startY,
            int deltaX, int deltaY,
            int directionX, int directionY,
            int delay)
    {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.directionX = directionX;
        this.directionY = directionY;

        setIcon( new ImageIcon("/Users/mikhail/Desktop/DVD_logo.png") );
        setSize(getPreferredSize() );
        setLocation(startX, startY);
        new javax.swing.Timer(delay, this).start();
    }

    public void actionPerformed(ActionEvent e)
    {
        Container parent = getParent();

        //  Determine next X position

        int nextX = getLocation().x + (deltaX * directionX);

        if (nextX < 0)
        {
            nextX = 0;
            directionX *= -1;
        }

        if ( nextX + getSize().width > parent.getSize().width)
        {
            nextX = parent.getSize().width - getSize().width;
            directionX *= -1;
        }

        //  Determine next Y position

        int nextY = getLocation().y + (deltaY * directionY);

        if (nextY < 0)
        {
            nextY = 0;
            directionY *= -1;
        }

        if ( nextY + getSize().height > parent.getSize().height)
        {
            nextY = parent.getSize().height - getSize().height;
            directionY *= -1;
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
        frame.setSize(1800,1800);
        frame.setVisible(true);
        frame.setLocationRelativeTo( null );
        panel.setBackground(Color.orange);
        frame.getContentPane().add( new DvDTraectory(300, 100, 3, 2, -1, 1, 20) );
//
    }
}