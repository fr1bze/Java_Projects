import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double max = -2 * Math.pow(10,9);
        double min = 2 * Math.pow(10,9);
        int a;
        for (int i = 0; i < n; ++i) {
        a = sc.nextInt();
        if (a > max)
            max = a;
        if (a < min)
            min = a;
        }
        System.out.println((int)min + "\n" +(int)max );
    }
}