import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        simple(a);
        simple(b);
        simple(c);
    }
        static  void simple(int a)
        {
            boolean sim = false;
            for (int i = 2; i < a;i++)
                if (a % i == 0) {
                    sim = true;
                    break;
                }
            sim = (a==1)?true:sim;
            System.out.println(sim ?"NO":"YES");
        }
    //разместите свою функцию, например здесь
}