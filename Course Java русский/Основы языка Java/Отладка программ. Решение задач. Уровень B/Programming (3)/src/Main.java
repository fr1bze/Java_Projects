import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    System.out.println(n - 2*k >= 0?n-2*k + 2020 :"Никогда");
        }
    }
