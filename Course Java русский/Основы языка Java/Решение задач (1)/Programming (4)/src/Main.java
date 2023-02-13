import java.util.Locale;
import java.util.Scanner;
class MyProgram{

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double min = 32000.0;
        double max = -32000.0;
        int min_ind = 0;
        int max_ind = 0;
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++)
        {
            if (arr[i] > max) {
                max = arr[i];
                max_ind = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                min_ind = i;
            }
        }
        double temp = arr[min_ind];
        arr[min_ind] = arr[max_ind];
        arr[max_ind] = temp;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}