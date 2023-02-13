import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.println(number % 10 + (number / 10) % 10 + number / 10 / 10 % 10);
    }
}