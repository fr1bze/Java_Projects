import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = 1001;
    int a = sc.nextInt();
    int b = sc.nextInt();
    long[] array = new long[n];
    for (int i = 1;i < n;i++ )
        array[i] = (i)*(i)*(i);
    System.out.println(array[a] + "\n" + array[b]);
    }
}