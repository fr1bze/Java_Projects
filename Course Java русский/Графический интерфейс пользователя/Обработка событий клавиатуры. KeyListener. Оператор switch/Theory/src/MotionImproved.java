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


public class MotionImproved {

    static JFrame frame = new JFrame();//создаем форму
    static int size = 50;//размер текстуры
    static JLabel l;//объект с картинкой
    static int width = 800, height = 600;
    static int change=30;//на сколько точек двигаем объект

    static public void move(KeyEvent e){//метод движения по клавиатуре
        int thisChange=e.isShiftDown()?change*2:change;//если нажата shift, то двигаемся вдвое быстрее
        switch (e.getKeyCode()){//делаем проверку на границы формы, пользуясь реальным размером окна, а не первоначально заданным, а также заданным смещением, чтобы вписаться в panel
            case (KeyEvent.VK_LEFT):
                if (l.getX()-thisChange>=0)//проверяем, вписываемся ли в окно, или надо будет перейти его границу
                    l.setLocation(l.getX()-thisChange,l.getY());
                else {//если переходим границу то проверяем, нажат ли шифт (двойная скорость) и находится ли картинка на расстоянии менее себя от границы
                    if (e.isShiftDown() && l.getX() <= l.getWidth())
                        l.setLocation((int) frame.getContentPane().getSize().getWidth() - l.getWidth()*2 - 5, l.getY());//если да, то к ставим картинку не просто на противоположенную границу, а еще на плюс картинку
                    else
                        l.setLocation((int) frame.getContentPane().getSize().getWidth() - l.getWidth() - 5, l.getY());//если нет то ставим картинку возле противоположенной границы
                }
                break;
            case (KeyEvent.VK_RIGHT):
                if (l.getX()+thisChange<(int) frame.getContentPane().getSize().getWidth()-l.getWidth())
                    l.setLocation(l.getX()+thisChange,l.getY());
                else {
                    if (e.isShiftDown()&&frame.getContentPane().getSize().getWidth()-l.getX()<=l.getWidth()*2)
                        l.setLocation(5+l.getWidth(), l.getY());
                    else
                        l.setLocation(5, l.getY());
                }
                break;
            case (KeyEvent.VK_UP):
                if (l.getY()-thisChange>=0)
                    l.setLocation(l.getX(),l.getY()-thisChange);
                else {
                    if (e.isShiftDown() && l.getY() <= l.getHeight())
                        l.setLocation(l.getX(), (int) frame.getContentPane().getSize().getHeight() - l.getHeight()*2 + 5);
                    else
                        l.setLocation(l.getX(), (int) frame.getContentPane().getSize().getHeight() - l.getHeight() + 5);
                }
                break;
            case (KeyEvent.VK_DOWN):
                if (l.getY()+thisChange<(int) frame.getContentPane().getSize().getHeight()-l.getHeight())
                    l.setLocation(l.getX(),l.getY()+thisChange);
                else {
                    if (e.isShiftDown()&&frame.getContentPane().getSize().getHeight()-l.getY()<=l.getHeight()*2)
                        l.setLocation(l.getX(), 5+l.getHeight());
                    else
                        l.setLocation(l.getX(), 5);
                }
                break;
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
        int delta = 30;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Простое перемещение клавиатурой");//заголовок формы
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//определяем разрешение монитора
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);//выставляем размеры окна
        BufferedImage image = ImageIO.read(new URL("https://tgram.ru/wiki/stickers/img/rmrick/png/6.png"));//скачиваем картинку
        JPanel panel = new JPanel (new FlowLayout(FlowLayout.LEFT));//создаем панель, чтобы ей отлавливать события клавиатуры, ставим ее слева
        panel.setFocusable(true);//делаем у панели возможность принимать фокус, иначе она не сможет отловить события клавиатуры
        l = new JLabel(new ImageIcon(image),JLabel.RIGHT);//создаем объект слева
        panel.add(l, BorderLayout.NORTH);//добавляем на панель
        frame.add(panel);//добавляем панель на форму
        panel.addKeyListener(new KeyAdapter() {//добавляем слушателя на панель
            public void keyPressed(KeyEvent e) {
                move(e);//метод движения
            }
        });

        frame.setVisible(true);//делаем форму видимой
        BufferedImage im = ImageIO.read(new URL("https://img.freepik.com/free-photo/texture-grass-field_1232-251.jpg?1")).getSubimage(0, 0, size, size);//скачиваем картинку с травой и обрезаем ее

//

    }
}
