import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
        static int factorial(int n)
        {
            if (n == 0)
            return 1;
            else return n*factorial(n-1);
        }
}