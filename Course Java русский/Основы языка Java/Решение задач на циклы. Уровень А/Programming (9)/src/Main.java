import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int yearsSum = 0;
        String age;
        String str;
        for (int i = 0; i < n; i++) {
            str = sc.nextLine();
            age = sc.nextLine();
            yearsSum += Integer.parseInt(age);
        }
        System.out.println((double) yearsSum / (double) n);
    }
}