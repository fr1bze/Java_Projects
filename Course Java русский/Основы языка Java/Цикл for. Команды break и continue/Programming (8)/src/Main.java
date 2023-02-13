import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 0; i <= n; i++)
    {
        sum+= Math.pow(a,i);
        continue;
    }
    System.out.println(sum);
    }
}