import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int temp;
    for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
    for (int i = 0; i < n; i++)
        for (int j = i; j < n; j++)
        {
            if (arr[j] > arr[i]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for (int i = n - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}