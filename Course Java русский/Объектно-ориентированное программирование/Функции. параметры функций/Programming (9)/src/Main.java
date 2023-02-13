import java.util.Scanner;

class Example{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] mas = new int[n][];
        for (int i = 0; i < n; i++){
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            int[] a = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++)
                a[j] = Integer.parseInt(numbers[j]);
            mas[i] = a;
        }
        maximin(mas);
    }
        static void maximin(int[][] arr)
        {
            int min_num = 0;
            int min[] = new int[arr.length];
            for (int i = 0; i < min.length;i++)
                min[i] = 32000;
            for (int i = 0; i < arr.length;i++)
                for (int j = 0; j < arr[i].length;j++)
                {
                    if (arr[i][j] < min[i])
                        min[i] = arr[i][j];
                }
            for (int i = 0; i < min.length;i++)
                if (min[i] > min_num)
                    min_num = min[i];
            System.out.println(min_num);
        }
    //разместите свою функцию, например здесь
}