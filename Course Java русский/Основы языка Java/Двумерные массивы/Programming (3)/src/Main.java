import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n;i++)
        {
            for (int j = 0; j < n; j ++)
            {
                if (i > j)
                    arr[i][j] = 2;
                if (i == j)
                    arr[i][j] = 1;
                if (i < j)
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