import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        if (s1.equals(s2) && s2.equals(s3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}