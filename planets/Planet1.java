import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.swing.*;

public class Planet1 extends Thread {
    static int width = 1200, height = 1200;//задаем размеры формы
    static JFrame frame = new JFrame();//создаем форму

    public static class RunPlanet extends Thread {//класс для запуска движения планеты в паралелльном потоке
        private int sleep;
        CreatePlanet planet;//созданная планета, для которой осуществляем движение
        public RunPlanet(CreatePlanet planet,int sleep) {/
            this.planet = planet;
            this.sleep = sleep;
        }
        @Override
        public void run() {
            for (int t = 0; t < 360;) {//идем по кругу
                try {
                    Thread.sleep(sleep);
                    planet.label.setBounds((int) (planet.r*Math.cos(t*Math.PI/180))+planet.dX, (int) (planet.r*Math.sin(t*Math.PI/180))+planet.dY, planet.w, planet.h);//перемещаем картинку в нужную точку, которую вычисляем по формуле параметрических уравнений линий, приводя градусы t к радианам
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                t=t==359?0:t+1;//этой формулой обеспечиваем постоянный цикл и обнуление t при 359
            }
        }
    }

    public static class CreatePlanet {//класс для создания планеты
        private String path;//имя файла с картинкой
        public int w, h;//длина и ширина картинки
        public int r;//радиус от солнца
        public int dX,dY;//константы для смещения картинки (т.к. координаты - это ее верхний левый угол, а не центр)
        public JLabel label;
        public CreatePlanet(String path, int r) throws IOException {//конструктор
            this.path = path;
            this.r=r;
            BufferedImage im = ImageIO.read(new File("/Users/mikhail/Desktop/planets/planets_phot/" + path));//открываем картинку
            label = new JLabel(new ImageIcon(im));//создаем объект с картинкой, который будем размещать и двигать
            w = im.getWidth();
            h = im.getHeight();
            label = new JLabel(new ImageIcon(im));//создаем объект с картинкой, который будем размещать и двигать
            if (r==0) label.setBounds(width / 2 - w / 2, height / 2 - h / 2 - 100, w, h);//если это Солнце, то выставляем ему начальные координаты
            dX=width/2-w/2;
            dY=height/2-h/2 - 100;
            frame.add(label);//добавляем картинку на форму
        }
    }

    public static void main(String[] args) throws IOException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Solar System");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//определяем разрешение монитора
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height + 30);//выставляем размеры окна
        frame.getContentPane().setLayout(null);//выравнивание, чтобы координаты объектов в дальнейшем считались от верхнего левого угла
        frame.getContentPane().setBackground(Color.black);
        new CreatePlanet("sun.jpeg", 0);
        frame.setVisible(true);//делаем форму видимой
        String[][] planets = new String[][]{new String[]{"mercury", "189", "50"}, {"venus", "239", "10"}, {"earth", "280", "15"}, {"mars", "330", "20"},
                {"jupyter", "390", "30"}, {"saturn", "450", "40"}, {"uranus", "500", "60"}, {"neptune", "560", "100"}};//заносим в массив названия планет, радиус от солнца и тайм-аут при движении
        for (int i = 0; i < planets.length; i++)//в цикле запускаем планеты
            new RunPlanet(new CreatePlanet(planets[i][0] + ".jpeg", Integer.valueOf(planets[i][1])), Integer.valueOf(planets[i][2])).start(); //команда start отвечает за запуск нескольких потоков, то есть выполняется все это в параллельных потоках, где скоростью вращения является частота обновления картинки, заданная в листе
    }
}