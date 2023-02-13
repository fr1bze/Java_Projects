import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int sum_ev = 0;
    for (int i = 0;i < n;i++)
    {
        a[i] = sc.nextInt();
        if(i % 2 == 0)
            sum_ev += a[i];
    }
    System.out.println(sum_ev);
    for (int i = 0; i < n; i+=2)
        System.out.println(a[i]);
    }
}