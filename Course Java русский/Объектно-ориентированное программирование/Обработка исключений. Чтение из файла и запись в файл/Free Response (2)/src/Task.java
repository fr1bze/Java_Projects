import java.io.*;
import java.util.Scanner;

public class Task {
  public static void main(String[] args) throws IOException {
    File file = new File("/Users/mikhail/IdeaProjects/Course Java русский/Объектно-ориентированное программирование/Обработка исключений. Чтение из файла и запись в файл/Free Response (2)/src/input.txt");
    Scanner sc1 = new Scanner(file);
    Scanner sc2 = new Scanner(file);
    FileWriter fw = new FileWriter("/Users/mikhail/IdeaProjects/Course Java русский/Объектно-ориентированное программирование/Обработка исключений. Чтение из файла и запись в файл/Free Response (2)/src/output.txt");
    while (sc1.hasNext()) {
      try {
        double a = sc1.nextDouble();
        String op = sc1.next();
        double b = sc1.nextDouble();
        String ops = "+-*/";
        String result = "";
        if (!ops.contains(op)) result = "Operation Error!";
        switch (op) {
          case "+": result = Double.toString(a + b); break;
          case "-": result = Double.toString(a - b); break;
          case "*": result = Double.toString(a * b); break;
          case "/": result = (b == 0 ? "Error! Division by zero" : Double.toString(a / b)); break;
        }
        fw.append(sc2.nextLine() + " = " + result + "\n");
        fw.flush();
      } catch (Exception ex) {
        fw.append(sc2.nextLine() + " = " + "Error! Not number" + "\n");
        fw.flush();
        sc1.nextLine();
      }
    }
    fw.close(); sc1.close(); sc2.close();
  }
}