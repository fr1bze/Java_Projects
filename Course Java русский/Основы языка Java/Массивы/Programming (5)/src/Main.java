import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int pos = 0;
    for (int i = 0; i < n; i++)
    {
        arr[i] = sc.nextInt();
    }
    int X = sc.nextInt();
    for (int i = 0; i < n; i++) {
        if (arr[i] >= X)
            pos = i;
    }
        System.out.println(pos == arr.length - 1? arr.length + 1: pos + 2);
    }
}