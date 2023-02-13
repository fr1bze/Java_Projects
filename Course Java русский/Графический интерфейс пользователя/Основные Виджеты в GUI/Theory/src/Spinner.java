import javax.swing.*;
import java.awt.*;

public class Spinner {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Спиннер");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int width=300, height=200;
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);
        JLabel label = new JLabel();
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton button = new JButton("Ответить");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);//выравниваем ее по центру
        JSpinner spinner = new JSpinner();
        spinner.setMaximumSize(new Dimension(100,50));//задаем ему максимальный размер, чтобы не растягивался по всей форме
        button.addActionListener(e-> label.setText("Ответ: " + spinner.getValue()));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//задаем менеджер для выравнивания
        panel.add(Box.createVerticalStrut(10));//между компонентами добавляем пустые промежутки
        panel.add(spinner);
        panel.add(Box.createVerticalStrut(10));
        panel.add(button);
        panel.add(Box.createVerticalStrut(10));
        panel.add(label);
        panel.add(Box.createVerticalStrut(10));
        frame.add(panel);
        frame.setVisible(true);
    }
}
