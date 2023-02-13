import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int del = 1;
        int min_del = x;
        while (del <= x) {
            del ++;
        if (x%del == 0 && del <= min_del) {
            min_del = del;
            System.out.println(del);
        }

        }

    }
}