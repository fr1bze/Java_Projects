import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a;
    boolean flag = false;
    for(int i = 0; i < n; i ++)
    {
        a = sc.nextInt();
        if(a % 10 == 4)
            flag = true;
    }
        if(flag)
        {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}