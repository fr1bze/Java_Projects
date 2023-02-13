import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i<=b;i++)
        {
            if ((i % 10) == 7 || (i % 10) == 3 )
                sum += i;
        }
        System.out.println(sum);
    }
}