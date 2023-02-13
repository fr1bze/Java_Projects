import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        boolean r = false;
        boolean s = false;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                 k*= arr[i][j];
                }
            if (k == 15) {
                r = true;
                break;
            }
        }
        if (r)
            System.out.println("YES");
        else System.out.println("NO");
        int p = 1;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    p *= arr[j][i];
                    }
                if (p == 15) {
                    s = true;
                    break;
                }
            }
        if (s)
            System.out.println("YES");
        else System.out.println("NO");

    }
}