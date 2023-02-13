import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    String str = age >= 21? "Да" : "Нет";
    System.out.println(str);
    }
}