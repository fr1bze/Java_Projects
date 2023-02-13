import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
            String str = a < 15 && a > 10? "коров" : a % 10 == 1? "корова" : a % 10 < 5 && a % 10 > 1 ? "коровы" : "коров";
            System.out.println(a + " " + str);

    }
}