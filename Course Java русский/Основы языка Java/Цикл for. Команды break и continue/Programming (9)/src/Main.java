import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String bin = "";
    while (N > 0)
    {
        bin += N%2;
        N = N/2;
    }
    System.out.println(bin);
    }
}