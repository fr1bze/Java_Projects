import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
        String a = (num % 10 == 1 ? "I" : num % 10 == 2 ? "II" : num % 10 == 3 ? "III" : num % 10 == 4 ? "IV" : num % 10 == 5 ? "V" : num % 10 == 6 ? "VI" : num % 10 == 7 ? "VII" : num % 10 == 8 ? "VIII" : num % 10 == 9 ? "IX" : "");
        String b  = (num / 100 == 1 ? "C" : num / 90 == 1 ? "XC" : num / 80 == 1 ? "LXXX" : num / 70 == 1 ? "LXX" : num / 60 == 1 ? "LX" : num / 50 == 1 ? "L" : num / 40 == 1 ? "XL" : num / 30 == 1 ? "XXX" : num / 20 == 1 ? "XX" : num / 10 == 1 ? "X" : "");
        System.out.print(b + a);
    }
}