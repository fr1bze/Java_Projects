import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        area(a, b, c);
    }

    static void area(int a, int b,int c)
    {
        System.out.println(2*a*b + 2 *b*c + 2 *a *c);
    }

}