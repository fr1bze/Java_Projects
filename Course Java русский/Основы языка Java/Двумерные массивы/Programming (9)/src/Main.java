import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr =new int[n][n];
        int temp = 0;
        for (int i = 0 ; i < n; i++)
        {
            for (int j = 0 ; j < n; j++)
                arr[i][j] = sc.nextInt();
        }
        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}