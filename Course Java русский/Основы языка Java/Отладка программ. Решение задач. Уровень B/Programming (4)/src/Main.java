import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int counter = 1;
    int d = 1;
    while (d <= (double)n/2)
    {
        if (n % d == 0) {
            counter++;
        }
        d++;
    }
    System.out.println(counter);
    }
}