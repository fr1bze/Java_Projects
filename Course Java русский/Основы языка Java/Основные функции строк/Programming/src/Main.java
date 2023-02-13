import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println(c > '0' && c <='9'?"yes":"no");

    }
}