import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(min(a, b, c, d));
    }

    static int min(int a, int b,int c, int d) {
        int[] mas = new int[4];
        mas[0] = a;
        mas[1] = b;
        mas[2] = c;
        mas[3] = d;
        Arrays.sort(mas);
        return mas[0];

    }


}