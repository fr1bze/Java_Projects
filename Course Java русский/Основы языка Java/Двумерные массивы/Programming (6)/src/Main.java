import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max_sum = Integer.MIN_VALUE;
    int max_ind = 0;
    int[][] arr = new int[n][];
    int k;
    int sum = 0;
    for (int i = 0; i < n ; i++)
    {
        k = sc.nextInt();
        arr[i] = new int[k];
        for (int j = 0; j < k; j ++)
            arr[i][j] = sc.nextInt();
    }
        for (int i = 0; i < n ; i++)
        {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
                if (sum > max_sum)
                {
                    max_sum = sum;
                    max_ind = i;
                }
                sum = 0;

        }
        System.out.println((max_ind + 1) + "\n" + max_sum);
        for (int i = 0; i < arr[max_ind].length;i++)
        {
            System.out.print(arr[max_ind][i] + " ");
        }
    }
}