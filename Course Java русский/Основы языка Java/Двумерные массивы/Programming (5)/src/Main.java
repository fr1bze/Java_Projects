import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int min = 32700;
    int[][] arr = new int[n][m];
    int I = 0, J = 0;
    for (int i = 0; i < n; i ++) {
        for (int j = 0; j < m; j++)
            arr[i][j] = sc.nextInt();
    }
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j++)
            {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    I = i;
                    J = j;
                }
            }
        }
        System.out.println(I + " " + J);
    }
}