import javax.swing.*;
import java.awt.*;

public class ComboBox {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Выбор цвета");
        int width = 400, height = 300;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        frame.setBounds(dim.width/2 - width, dim.height/2 - height,width,height);
        //frame.setLocationRelativeTo(null); --- по центру экрана выставления фрейма
        JComboBox<String> comboBox = new JComboBox<>();
        String[] colors = {"Красный", "Зеленый","Фиолетовый","Синий", "Голубой","Жёлтый",
        "Оранжевый","Розовый", "Белый","Коричневый","Чёрный"};
        for(String color: colors)
            comboBox.addItem(color);
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);
        JCheckBox checkBox = new JCheckBox();
        checkBox.setSelected(false);
        checkBox.setText("Свой вариант");
        JTextField textField = new JTextField("Введите свой текст");
        JButton button = new JButton("Ответить");
        JLabel label = new JLabel();
        button.setMaximumSize(new Dimension(100,50));
        textField.setMaximumSize(new Dimension(200,40));
        comboBox.setMaximumSize(new Dimension(200,40));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);//выравниваем ее по центру
        checkBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(Box.createVerticalStrut(10));//между компонентами добавляем пустые промежутки
        panel.add(comboBox);
        panel.add(Box.createVerticalStrut(10));//между компонентами добавляем пустые промежутки
        panel.add(checkBox);
        panel.add(Box.createVerticalStrut(10));
        panel.add(textField);
        panel.add(Box.createVerticalStrut(10));
        button.addActionListener(e->{if (checkBox.isSelected())
        {
            label.setText("Ваш выбор: " + textField.getText());
        }
        else label.setText("Ваш выбор: " + (String)comboBox.getSelectedItem());
        panel.add(label);
        });
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
