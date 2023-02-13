import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        if (n == 1) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
                continue;
            }
            System.out.println(fact);
        }
    }
}