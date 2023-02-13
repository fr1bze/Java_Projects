import java.text.DecimalFormat;
import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i ++ )
            for (int j = 0; j < 2; j ++)
                arr[i][j] = sc.nextInt();
        DecimalFormat decimalFormat = new DecimalFormat("0.0#");
        System.out.println(decimalFormat.format(perimetr(arr)));
        System.out.println(decimalFormat.format(area(arr)));
    }

    static double area(int[][] arr)
    {
      double sum1 = 0;
      double sum2 = 0;
      for (int i = 0; i < arr.length - 1;i++ ) {
          sum1 += arr[i][0] * arr[i + 1][1];
          sum2 += arr[i+1][0]*arr[i][1];
      }
      return Math.abs((sum2 - sum1) / 2);
    }

    static double perimetr(int[][] arr)
    {
         double p = Math.sqrt(Math.pow(arr[arr.length-1][0] - arr[0][0],2) + Math.pow(arr[arr.length-1][1] - arr[0][1],2));
        for (int i = 0; i < arr.length - 1; i++)
            p += Math.sqrt(Math.pow(arr[i+1][0] - arr[i][0],2) + Math.pow(arr[i + 1][1] - arr[i][1],2));
            return p;
    }
}