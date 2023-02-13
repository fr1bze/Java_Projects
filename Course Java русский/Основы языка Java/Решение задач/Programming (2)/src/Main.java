import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int same_digit = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (arr[i]*arr[i-1] > 0)
                same_digit ++;
        }
        if (same_digit > 0)
            System.out.println("YES");
        else System.out.println("NO");
    }
}