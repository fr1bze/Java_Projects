import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n - 10 > n/2) {
            System.out.println(n-10);
        } else {
            System.out.println(n/2);
        }
    }
}