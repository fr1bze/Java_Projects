import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String temp  = "";
        if (n != 0) {
            while (n != 0) {
                temp = temp + n % k;
                n = n / k;
            }
            String str = new StringBuffer(temp).reverse().toString();
            System.out.println(str);
        }
        else System.out.println(0);
    }
    }
