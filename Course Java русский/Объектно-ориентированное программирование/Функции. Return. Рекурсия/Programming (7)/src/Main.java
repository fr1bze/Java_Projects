import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        king_step(x1, y1, x2, y2);
    }
    static void king_step(int x1, int y1, int x2, int y2) {
        if ((x1 > 8 || x1 < 1) || (y1 > 8 || y1 < 1)) {
            System.out.println("1");
            return;
        }
        if ((x2 > 8 || x2 < 1) || (y2 > 8 || y2 < 1)) {
            System.out.println("2");
            return;
        }
        if (x1 == x2 && y1 == y2) {
            System.out.println("3");
            return;
        }
        if ((Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 1) || (Math.abs(x2 - x1) == 0 && Math.abs(y2 - y1) == 1) || (Math.abs(x2 - x1) == 1 && y2 - y1 == 0))
        {
            System.out.println("YES");
        } else
        System.out.println("NO");

    }
}