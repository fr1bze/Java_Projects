import java.util.Scanner;

class MyProgram1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];
        for (int i = 0; i < n;i++)
        {
            for (int j = 0; j < n; j ++)
            {
                if (i > n - j - 1 )
                    arr[i][j] = 2;
                if (i  == n - j - 1)
                    arr[i][j] = 1;
                if (i < n - j - 1)
                    arr[i][j] = 0;
            }
        }
        for (int i = 0; i < n;i++)
        {
            for (int j = 0; j < n; j ++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}