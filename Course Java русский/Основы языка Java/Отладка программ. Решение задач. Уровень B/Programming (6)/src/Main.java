import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int n_3 = 0;
    int negative = 0;
    while (a != 0)
    {
        if (a % 3 == 0  && a > 0)
           n_3 ++;
        else if (a % 3 == 0 && a < 0)
        {
            n_3 ++;
            negative++;
        }
        else if (a < 0 && a % 3 != 0)
        {
            negative++;
        }
        a = sc.nextInt();
    }
    System.out.println(negative > n_3? "negative":negative==n_3?"Equal":"333");
    }
}