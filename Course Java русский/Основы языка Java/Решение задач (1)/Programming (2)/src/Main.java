import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int a = sc.nextInt();
        while (a != 0)
        {
            if (a % 3 == 0 && a > max)
                max = a;
            a = sc.nextInt();

        }
System.out.println(max != 0?max:404);
    }
}