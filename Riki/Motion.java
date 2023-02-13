// You can experiment here, it won’t be checked

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;


public class Motin {

    static JFrame frame = new JFrame();//создаем форму
    static int size = 50;//размер текстуры
    static JLabel label;//объект с картинкой
    static public int delta = 30;


    public static void move(KeyEvent e) {
            switch (e.getKeyChar()) {
                case 'a': {
                    if (label.getX() > -2*(size - delta)) {
                        label.setLocation(label.getX() - delta, label.getY());
                    }else label.setLocation(frame.getWidth(),label.getY());
                    break;
                }
                case 'd': {
                    if (label.getX() < frame.getWidth()) {
                        label.setLocation(label.getX() + delta, label.getY());
                    }else label.setLocation(0,label.getY());
                    break;
                }
                case 'w': {
                    if (label.getY() > 0)
                    label.setLocation(label.getX(), label.getY() - delta);
                    else label.setLocation(label.getX(),frame.getHeight());
                    break;
                }
                case 's': {
                    if (label.getY() < frame.getHeight())
                    label.setLocation(label.getX(), label.getY() + delta);
                    else label.setLocation(label.getX(),0);
                    break;
                }
            }
    }

//    public static class AddTexture {//класс для добавления текстур
//        public JLabel l;
//        public JPanel panel;
//
//        public AddTexture(BufferedImage im, int i, int j) {//получаем на вход картинку и шаги циклов
//            l = new JLabel(new ImageIcon(im));//создаем объект с текстурой
//            l.setBounds(i * size, j * size, size, size);//устанавливаем его координаты
//            this.panel.add(l);//добавляем на форму
//}

        public static void main(String[] args) throws IOException {
            int width = 800, height = 600;
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//способ выхода из формы
                frame.setTitle("Простое перемещение клавиатурой");//заголовок формы
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//определяем разрешение монитора
                frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);//выставляем размеры окна
                BufferedImage image = ImageIO.read(new URL("https://tgram.ru/wiki/stickers/img/rmrick/png/6.png"));//скачиваем картинку
                JPanel panel = new JPanel (new FlowLayout(FlowLayout.LEFT));//создаем панель, чтобы ей отлавливать события клавиатуры, ставим ее слева
                panel.setFocusable(true);//делаем у панели возможность принимать фокус, иначе она не сможет отловить события клавиатуры
                label = new JLabel(new ImageIcon(image),JLabel.RIGHT);//создаем объект слева
                panel.add(label, BorderLayout.NORTH);//добавляем на панель
                frame.add(panel);//добавляем панель на форму
                panel.addKeyListener(new KeyAdapter() {//добавляем слушателя на панель
                    public void keyReleased(KeyEvent e) {
                        move(e);//метод движения
                    }
                });
                frame.setVisible(true);//делаем форму видимой
            BufferedImage im = ImageIO.read(new URL("https://img.freepik.com/free-photo/texture-grass-field_1232-251.jpg?1")).getSubimage(0, 0, size, size);//скачиваем картинку с травой и обрезаем ее

//            for (int i = 0; i <= width / size; i++)
//                for (int j = 0; j <= height / size; j++)
//                    new AddTexture(im, i, j);//создаем объект с текстурой и размещаем его в цикле

        }
    }

