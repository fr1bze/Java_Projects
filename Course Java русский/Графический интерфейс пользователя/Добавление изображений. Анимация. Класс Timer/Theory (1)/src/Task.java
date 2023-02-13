import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    ActionListener messageAL = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Новое Сообщение! Получено в " + dateFormat.format(date));
      }
    };
    Timer myTimer = new Timer(3000, messageAL);
    myTimer.start();
    Scanner sc = new Scanner(System.in);
    sc.nextLine();
  }
}
  