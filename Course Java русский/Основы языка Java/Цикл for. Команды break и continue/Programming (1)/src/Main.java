import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        int count_ev = 0;
        while (counter != n) {
            counter++;
            int a = sc.nextInt();
            if( a % 2 == 0) {
                count_ev++;
            }
        }
        System.out.println(count_ev);
    }
}