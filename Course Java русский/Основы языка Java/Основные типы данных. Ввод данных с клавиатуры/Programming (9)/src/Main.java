import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int velocity = sc.nextInt();
        System.out.println((time * velocity + 109)% 109);
    }
}