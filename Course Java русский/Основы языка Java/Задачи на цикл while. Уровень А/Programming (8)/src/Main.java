import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n = sc.nextInt();
        String symb = "";
        while (i <= n) {
            System.out.println(symb);
            i++;
            symb+= "*";
        }
    }
}