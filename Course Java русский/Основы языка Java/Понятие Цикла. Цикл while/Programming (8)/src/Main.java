import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int counter = 1;
    double sum = x;
    while (sum < y) {
        sum *= 1.1;
        counter++;
        //System.out.println(sum);

    }
    System.out.println(counter);
    }
}