import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        }
        for (int j = 0; j < m; j++)
        {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][m - j - 1] + " ");
            }
            System.out.println();
        }
    }
}