import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Cars extends Thread {
    static int width = 1200, height = 1200;
    static JFrame frame = new JFrame();//создаем форму
    static int number = 0;

    public static class CreateCar {//класс для создания планеты
        private String path;//имя файла с картинкой
        public int  y; //позиция по y
        public JLabel label;
        public int num;
        public BufferedImage im;


        public CreateCar(BufferedImage im, int num,int y) throws IOException {//конструктор
            this.num = num; //от 1 до 5
            this.y = y;

            this.im = im;
            label = new JLabel(new ImageIcon(im));//создаем объект с картинкой, который будем размещать и двигать
            label.setBounds(10, this.y, im.getWidth(), im.getHeight());//ставим машину на старт на высоте y
            frame.add(label);//добавляем картинку на форму
        }
    }

    public static class RunCar extends Thread {
        CreateCar car;//создан объект класса CreateCar, для которог осуществляем движение

        public RunCar(CreateCar car) {//конструктор
            this.car = car;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (number == 0 )
            {
                try {
                    Thread.sleep(3);
                    car.label.setBounds(car.label.getX() + (int)(Math.random()*5),car.y,car.label.getWidth(),car.label.getHeight() );
                    if( car.label.getX() + car.label.getWidth() > width - 10)
                    {
                        if(number == 0)
                            number = car.num;
                        JLabel text = new JLabel();
                        text.setText((number +1) + " is Winner!") ;
                        JOptionPane.showMessageDialog(null, "Победила машина с номером: " +(car.num+1));
                        text.setFont(new Font("Arial", Font.BOLD, 50));
                        text.setBounds(width / 2 - 200, height / 2 - 100, 350, 40);
                        text.setBackground(Color.orange);
                        frame.add(text);
                        text.repaint();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }


        public static void main(String[] args) throws IOException {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Competition");//заголовок формы
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//определяем разрешение монитора
            frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height + 30);//выставляем размеры окна
            frame.getContentPane().setLayout(null);//выравнивание, чтобы координаты объектов в дальнейшем считались от верхнего левого угла
            frame.getContentPane().setBackground(Color.GRAY);//фон окна
            frame.setVisible(true);//делаем форму видимой
            BufferedImage im = ImageIO.read(new URL("https://naves74.ru/images/png_araba_resimleri-wwwnisanboard_94.png?crc=4145026359"));
            String[] cars = {"1", "2", "3","4","5"};
            for (int i = 0; i < cars.length; i++) //в цикле создаем машины
                new RunCar(new CreateCar(im, i,200 * i)).start();
        }
}
