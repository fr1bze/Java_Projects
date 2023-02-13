import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if (temp > 22.4) {
            System.out.println("Тепло!");
        } else if (temp < 22.4) {
            System.out.println("Холодно(");
        } else {
            System.out.println("Прохладно...");
        }
    }
}