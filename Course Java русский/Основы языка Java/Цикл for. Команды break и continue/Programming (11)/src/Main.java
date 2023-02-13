import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int counter = 0;
    double max = -2 * Math.pow(10,9);
        while (n != 0) {
            if (n > max) {
                max = n;
                counter = 0;
            }
            if (n == max) {
                counter++;
            }
            n = sc.nextInt();
        }
        System.out.println(counter);
    }
}