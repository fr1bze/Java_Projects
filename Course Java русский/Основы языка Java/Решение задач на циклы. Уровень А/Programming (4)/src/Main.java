import java.util.Scanner;

class prg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = 1;
        for (int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            sum *= a;
        }
        System.out.println(sum);
    }
}