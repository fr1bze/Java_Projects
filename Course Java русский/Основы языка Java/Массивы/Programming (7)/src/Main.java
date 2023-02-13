import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
        for (int i = 0; i < n; arr[i] = sc.nextInt(), i++);
        for (int i = 0 ; i < n - 1; i+=2)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int i = 0;i < n;i++)
            System.out.println(arr[i]);
    }
}