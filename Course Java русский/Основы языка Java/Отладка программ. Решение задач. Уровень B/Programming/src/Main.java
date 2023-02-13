import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    for (int i = b;i>=a;i -= 2)
    {
        System.out.println(i);
    }
    }
}