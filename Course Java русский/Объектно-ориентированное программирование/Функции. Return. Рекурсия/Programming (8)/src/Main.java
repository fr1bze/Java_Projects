import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(akkerman(m, n));
    }

    static int akkerman(int m, int n)
    {
        if (m == 0)
            return  n + 1;
        if ( m > 0 && n == 0)
            return akkerman(m-1,1);
        if ( m > 0 && n > 0)
            return akkerman(m-1, akkerman(m,n-1));
        return -1;
    }

}