import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int sum = 0;
    while (sum < n) {
        sum += x;
    }
    System.out.println(sum);
    }
}