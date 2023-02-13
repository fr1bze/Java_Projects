import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
    {
        arr[i] = sc.nextInt();
    }
    int a = sc.nextInt();
    int b = sc.nextInt();
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
    for (int i = 0; i < n ; i++)
    System.out.println(arr[i]);
    }
}