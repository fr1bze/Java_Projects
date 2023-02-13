import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        sort(mas);
        for(int i: mas)
            System.out.print(i + " ");
    }

    static void sort(int[] mas)
    {
        int[] arr = mas.clone();
        Arrays.sort(arr, Collections.reverseOrder());
    }

}