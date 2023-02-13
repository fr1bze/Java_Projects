import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
       if ((((n*m - k)% m == 0) || ((n*m - k)% n == 0)) && (k < n * m)) {
            System.out.println("YES");
    } else {
           System.out.println("NO");
       }
}
}