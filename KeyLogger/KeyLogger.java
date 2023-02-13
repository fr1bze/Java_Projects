import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class KeyLogger{
    static JFrame frame = new JFrame();
    static JLabel l;//объект с текстом
    static File file = new File("/Users/mikhail/Desktop/Java_Projects/KeyLogger/keyboard.txt");//объявляем файл для записи
    static FileWriter writer;//объявляем writer для записи в файл
    static String str = "";

    static public void print(KeyEvent e) throws IOException {//метод движения по клавиатуре
        if (e.getKeyCode()!=KeyEvent.VK_ESCAPE) {
            l.setText(e.getKeyText(e.getKeyCode()));//показываем нажатие в метке
            str += e.getKeyChar();
            System.out.println("Key pressed: " + str.substring(str.length()-1));
            writer.write(str.substring(str.length()-1));
        }
        writer.flush();
    }


    public static void main(String[] args) throws IOException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//способ выхода из формы
        frame.setTitle("Запись клавиш");//заголовок формы
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//определяем разрешение монитора
        int width=600, height=100;//задаем размер окна
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);//выставляем размеры окна
        JPanel panel = new JPanel (new FlowLayout(FlowLayout.CENTER));//создаем панель, чтобы ей отлавливать события клавиатуры, ставим ее слева
        panel.setFocusable(true);//делаем у панели возможность принимать фокус, иначе она не сможет отловить события клавиатуры
        l = new JLabel();//создаем объект
        panel.add(l, BorderLayout.CENTER);//добавляем на панель по центру
        frame.add(panel);//добавляем панель на форму
        writer = new FileWriter(file);//создаем врайтер для файла
        panel.addKeyListener(new KeyAdapter() {//добавляем слушателя на панель
            public void keyReleased(KeyEvent e) {
                try {
                    print(e);//метод записи
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        frame.setVisible(true);//делаем форму видимой
    }
}


