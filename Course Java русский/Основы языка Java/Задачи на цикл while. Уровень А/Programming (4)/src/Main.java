import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int counter = 0;
       while (k != 0) {
       counter++;
       k = sc.nextInt();
       }
       System.out.println(counter);
    }
}