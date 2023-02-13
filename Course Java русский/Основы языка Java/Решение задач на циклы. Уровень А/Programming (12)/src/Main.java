import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = 1;
    while (n > 0)
    {
        p*= n%10;
        n = n/10;
    }
    System.out.println(p);
    }
}