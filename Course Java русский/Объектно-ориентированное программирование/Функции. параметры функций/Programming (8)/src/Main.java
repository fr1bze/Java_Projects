import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sortByLength(s);
    }

    static void sortByLength(String str)
    {
        String[] arr = str.split(" ");
        Arrays.sort(arr);
        String temp = "";
        for (int i = 0; i < arr.length;i++)
            for (int j = i; j < arr.length;j++)
            {
                if (arr[i].length() > arr[j].length())
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                else if (arr[i].length() == arr[j].length())
                if (arr[i].charAt(0) > arr[j].charAt(0))
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        for (int i = 0; i < arr.length;i++)
            System.out.print(arr[i] + " ");
    }

    //разместите свою функцию, например здесь
}