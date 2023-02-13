import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        simpleAB(x, y);
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
        System.out.println(sim ?a + " - составное":a + " - простое");
    }
     static void simpleAB(int a,int b) {
         boolean sim = true;
         for (int i = a; i < b + 1; i++) {
             if (i == 1) {
                 System.out.println(i + " - " + 1);
                 continue;
             }
             simple(i);
         }
     }
    //разместите свои функции, например здесь
}