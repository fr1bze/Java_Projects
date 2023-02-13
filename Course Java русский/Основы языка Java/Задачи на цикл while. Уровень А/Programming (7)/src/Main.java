import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        int mul = 1;
        if (n == 1) {
            int a = sc.nextInt();
            System.out.print(1 + " " + a);
        } else {
            while (mul < n) {
                 int a = sc.nextInt();
                counter++;
                mul =mul * a;
            }
            System.out.print(counter + " " + mul);
        }
    }
}