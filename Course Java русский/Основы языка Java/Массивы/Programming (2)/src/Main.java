import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        a[i] = sc.nextInt();
        sum+=a[i];
        //System.out.println(a[i]);
    }
    System.out.println(sum);
    for (int i = n-1; i >=0;i-- )
    {
        System.out.println(a[i]);
    }
    }
}