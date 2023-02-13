import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int counter = 0;
    int a = sc.nextInt();
    int temp = a;
    while (a!= 0) {
        if (a > temp) {
            counter++;
        }
        a = sc.nextInt();
    }
    System.out.println(counter);
    }
}