import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int v = sc.nextInt();
        int s = t * v;
        System.out.println(s);
    }
}