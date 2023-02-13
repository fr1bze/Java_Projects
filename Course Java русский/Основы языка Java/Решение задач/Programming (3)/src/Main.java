import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int counter = 0;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
    for (int i = 1; i < n - 1; i++)
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
            counter ++;
    System.out.println(counter);
    }
}