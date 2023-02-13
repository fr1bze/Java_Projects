import java.io.*;
import java.util.Scanner;
public class Task {
  public static void main(String[] args) throws IOException {
    String pathIn = "/Users/mikhail/IdeaProjects/Course Java русский/Объектно-ориентированное программирование/Обработка исключений. Чтение из файла и запись в файл/Free Response/src/input.txt";
    File file = new File(pathIn);
    Scanner sc = new Scanner(file);
    while(sc.hasNextLine()) {
      String str = sc.nextLine();
      System.out.print(str + "= ");
      Calculator c = new Calculator();
      c.calculate(str);
    }
    sc.close();
  }
}

class Calculator {
  static String pathOut = "/Users/mikhail/IdeaProjects/Course Java русский/Объектно-ориентированное программирование/Обработка исключений. Чтение из файла и запись в файл/Free Response/src/output.txt";
  void calculate(String str) throws IOException {
    File fileOut = new File(pathOut);
    FileWriter fw = new FileWriter(fileOut);
    String[] s = str.split(" ");
    try{
      double a = Double.parseDouble(s[0]);
      String st = s[1];
      double b = Double.parseDouble(s[2]);
      if(st.equals("+")){
        fw.write(String.valueOf( a + b));
        System.out.println(a + b);
      }else if (st.equals("-")) {
        fw.write(String.valueOf(a - b));
        System.out.println(a - b);
      }
      else if (st.equals("*")) {
        fw.write(String.valueOf(a * b));
        System.out.println(a * b);
      }
      else if (st.equals("/")) {
        if(b == 0){
          throw new Exception("Error! Division by zero");
        }
        fw.write(String.valueOf( a / b));
        System.out.println(a /b);
      }
      else throw new Exception("Operation Error!");
    }catch( NumberFormatException nfe){
      fw.write("Error! Not number");
      System.out.println("Error! Not number");

    } catch (Exception ex) {
      fw.write(ex.getMessage());
      System.out.println(ex.getMessage());
    }
  }
}
