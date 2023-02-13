import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int counter = 0;
        boolean[] mas = new boolean[n];
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i ++)
            for (int j = 0; j < m; j ++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

        for (int i = 0; i < n; i ++)
            for (int j = 0; j < m; j++)
                if (arr[i][j] == max) {
                    counter++;
                    mas[i] = true;
                    break;
                }
        sc.close();
        System.out.println(counter);
        for (int i = 0; i < n; i++)
            System.out.print(mas[i] == true?i + " ":"");


    }
}