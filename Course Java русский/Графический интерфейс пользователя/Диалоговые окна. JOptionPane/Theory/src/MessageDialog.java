import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MessageDialog {
    static JFrame frame = new JFrame();
    static JPanel panel = new JPanel();
    static void show()
    {
            JOptionPane.showMessageDialog(panel,"Привет, меня зовут Миша", "Выскакивающее окно", JOptionPane.PLAIN_MESSAGE);
    }
    public static void showMessageDialog(Component parent,
                                         Object message,
                                         String title,
                                         int messageType)
            throws HeadlessException
    {
    }

        public static void main(String[] args)
        {
            frame.setTitle("Message dialog");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dimension = toolkit.getScreenSize();
            frame.setSize(dimension.width,dimension.height);
            frame.add(panel);
            panel.setFocusable(true);
            frame.setVisible(true);
            panel.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode()==KeyEvent.VK_SPACE) //если нажат пробел
                        show();
                }
            });
        }
}
