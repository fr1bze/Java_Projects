import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] sum = new int[2*n + 2];
        boolean magic = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
            {
                k += arr[i][j];
            }
            sum[i] = k;
            k = 0;
            for (int j = 0; j < n; j++)
            {
                k += arr[j][i];
            }
            sum[n + i] = k;
            k = 0;
        }
        int temp1 = 0, temp2 = 0;
        for (int i = 0; i < n; i++) {
            temp1+= arr[i][i];
            sum[2*n] = temp1;
            temp2+=arr[i][n-i-1];
            sum[2*n + 1] = temp2;
        }
        boolean mag = true;
        int sum_res = sum[0];
        for (int i = 0; i < sum.length;i++) {
            if (sum[i] == sum_res)
                continue;
            else mag = false;
        }
        if (mag)
            System.out.println("YES");
        else System.out.println("NO");
    }
}