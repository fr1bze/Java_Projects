import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(s.length() - 2));
        System.out.println(s.substring(0,5));
        System.out.println(s.substring(0,s.length() - 2));
        System.out.println(s.substring(3,s.length()));
        System.out.println(s.length());

    }
}