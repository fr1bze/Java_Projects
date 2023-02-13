import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //rubles
        int b = sc.nextInt(); //kopek
        int n = sc.nextInt(); //number
        System.out.println(a * n + (b * n)/100 + " " + n * b % 100);
    }
}