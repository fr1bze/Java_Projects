import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int counter = 0;
        while (a != 0) {
            sum += a;
            counter++;
            a = sc.nextInt();
        }
        System.out.println(sum/(double)counter);
    }
}