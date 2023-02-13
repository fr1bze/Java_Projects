import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        monneub(mas);
    }
    static void monneub(int[] arr)
    {
        int counter = 1;
        int max = 1;
        for (int i = 0; i < arr.length-1;i++)
        {
            if (arr[i] <= arr[i+1]) {
                counter++;
                if (counter > max)
                    max = counter;
            }
            else counter = 1;
        }
        System.out.println(max);

    }

    //разместите свою функцию, например здесь
}