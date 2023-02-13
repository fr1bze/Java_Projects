import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func3_5(n));
    }
    static String func3_5(int n)
    {
        if (n == 1)
            return "YES";
        if((n-1)%3 == 0 || n%5 == 0) return "YES";
        return "NO";

    }
}