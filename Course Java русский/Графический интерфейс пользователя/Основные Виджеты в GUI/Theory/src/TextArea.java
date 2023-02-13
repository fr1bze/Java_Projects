//import javax.swing.*;
//import java.awt.*;
//
//public class TextArea {
//    public static void main(String[] args)
//    {
//        JFrame frame = new JFrame("TextArea");
//        int width = 400, height = 250;
//        frame.setLocationRelativeTo(null);
//        frame.setSize(width,height);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        JTextArea area = new JTextArea();
//        area.setRows(4);
//        JTextField textField = new JTextField();
//        textField.setMaximumSize(new Dimension(400,40));
//        JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);//создаем скролл для текстареа
//        scroll.setMaximumSize(new Dimension(400,300));//задаем ему максимальный размер, чтобы не растягивался по всей форме
//        scroll.setAlignmentX(Component.CENTER_ALIGNMENT);
//        JPanel panel = new JPanel();
//        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
//        JButton button = new JButton("Добавить текст");
//        button.addActionListener(e->area.append("\n"+textField.getText()));
//        area.setAlignmentX(Component.CENTER_ALIGNMENT);
//        textField.setAlignmentX(Component.CENTER_ALIGNMENT);
//        button.setAlignmentX(Component.CENTER_ALIGNMENT);
//        panel.add(textField);
//        panel.add(button);
//        panel.add(area);
//        panel.add(scroll);
//        frame.add(panel);
//        frame.setVisible(true);
//    }
//}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea {
    static JPanel panel = new JPanel ();//создаем панель

    static void addObject(JComponent o, int n, float alignmentX){//метод добавления объектов на панель
        o.setAlignmentX(alignmentX);//устанавливаем горизонтальное выравнивание
        panel.add(o);//добавляем объект на панель
        if (n>0) panel.add(Box.createVerticalStrut(n));//добавляем пустой промежуток после него, если он задан
    };

    public static void main(String[] args) {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//задаем менеджер для выравнивания
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));//расширяем границы панели, чтобы элементы не прижимались вплотную к границе

        JFrame frame = new JFrame();//создаем форму
        frame.setResizable(false);//отключаем возможность изменения ее размеров
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//способ выхода из формы
        frame.setTitle("TextArea");//заголовок формы
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//определяем разрешение монитора
        int width=300, height=200;//задаем размер окна
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);//выставляем размеры окна

        JTextField textBox = new JTextField();//создаем текстбокс
        textBox.setMaximumSize(new Dimension(300,30));//задаем ему максимальный размер, чтобы не растягивался по всей форме
        addObject(textBox,10,Component.CENTER_ALIGNMENT);//добавляем его

        JButton button = new JButton("Записать");//создаем кнопку
        addObject(button,10,Component.CENTER_ALIGNMENT);//добавляем его

        JTextArea textArea = new JTextArea();//создаем текстареа
        textArea.setRows(8);//задаем ему видимое значение строк, иначе после упаковки он сожмется до одной строки
        JScrollPane scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);//создаем скролл для текстареа
        scroll.setMaximumSize(new Dimension(300,100));//задаем ему максимальный размер, чтобы не растягивался по всей форме
        addObject(scroll,10,Component.CENTER_ALIGNMENT);//добавляем его

        button.addActionListener(e ->  {
                textArea.setText(textArea.getText()+(textArea.getText().length()==0?"":"\n")+textBox.getText());//считываем значение из тексбокса в тексареа
        });
        frame.add(panel);
        frame.setVisible(true);
    }
}