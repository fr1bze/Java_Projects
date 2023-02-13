import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int counter = 0;
    while (counter != n) {
        counter++;
        int a = sc.nextInt();
        sum += a;

    }
        System.out.println(sum);
    }
}