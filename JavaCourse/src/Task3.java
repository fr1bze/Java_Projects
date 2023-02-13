import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of blocks
        int k = sc.nextInt(); // number of doors
        int[] arr = new int[n];
        int[] arrCopy = new int[n];
        arrCopy = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < n; i ++)
        {
            arr[i] = sc.nextInt();
        }
    }
}
