import javax.swing.*;
import java.awt.*;
import java.util.Enumeration;

public class Season {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Favorite season");
        frame.setLocationRelativeTo(null);
        int width = 300, height = 400;
        frame.setSize(width,height);
        JRadioButton[] buttons = new JRadioButton[4];
        ButtonGroup buttonGroup = new ButtonGroup(); // создание группы кнопок
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1,0,0)); // устанавливаем на панель кол-во рядов и колонну
            buttons[0] = new JRadioButton("Зима");
            buttons[0].setActionCommand("Зима");
        buttons[1] = new JRadioButton("Весна");
        buttons[1].setActionCommand("Весна");
        buttons[2] = new JRadioButton("Лето");
        buttons[2].setActionCommand("Лето");
        buttons[3] = new JRadioButton("Осень");
        buttons[3].setActionCommand("Осень");
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        for (int i = 0; i < 4; i++) {
            buttonGroup.add(buttons[i]);
            buttons[i].setAlignmentX(Component.CENTER_ALIGNMENT);//выравниваем ее по центру
            buttons[i].setMaximumSize(new Dimension(100,20));
            panel.add(buttons[i]);
            panel.add(Box.createVerticalStrut(5));
        }

        JLabel label = new JLabel();
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton button = new JButton("Ответить");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(e->
    {
        String answer = "";
        for (JRadioButton but : buttons) {
            if (but.isSelected())
                answer = but.getText();
        }
            label.setText("Ваш ответ: " + answer);
            panel.add(label);

    });
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
