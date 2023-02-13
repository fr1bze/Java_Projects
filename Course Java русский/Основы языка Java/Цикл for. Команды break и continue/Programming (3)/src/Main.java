import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a;
        for ( ; sc.hasNext() ; ) {
            a = sc.nextInt();
           if (a % 7 == 0)
           {
               break;
           }
           if (a % 10 == 7 && a% 7 != 0)
           {
               sum += a;
               continue;
           }
       }
     System.out.println(sum);
}

}
