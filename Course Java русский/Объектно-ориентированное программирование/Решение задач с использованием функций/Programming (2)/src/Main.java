import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = sc.nextInt() == 1 ? true : false;
        boolean s = sc.nextInt() == 1 ? true : false;
        boolean t = sc.nextInt() == 1 ? true : false;
        System.out.println(election(f, s, t));
    }
        static boolean election(boolean f, boolean s, boolean t)
        {
            int count = 0;
            if (f == true)
                count++;
            if ( s == true)
                count++;
            if (t == true)
                count++;
            if (count/3.0 > 0.5)
                return true;
            return false;
        }
}