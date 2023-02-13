import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        System.out.println("Секунд прошло: " + second_count(d, h, m, s));
    }
        static int second_count(int d, int h, int m, int s)
        {

            return d * 24 * 3600 + h* 3600 + m * 60 + s;
        }
}