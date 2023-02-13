import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int counter = 0;
        while ((counter+1) * (counter+1) <= i ) {
            ++counter;
            System.out.println(counter*counter);
        }
    }
}