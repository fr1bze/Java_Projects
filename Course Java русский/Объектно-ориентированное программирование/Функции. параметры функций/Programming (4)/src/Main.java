import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        int x = sc.nextInt();
        perimeter(figure, x);
        area(figure, x);
    }

    static void perimeter(String figure, int x)
    {
        if (figure.equals("Квадрат"))
            System.out.println(4*x);
        if (figure.equals("Круг"))
            System.out.println((int)Math.ceil(6.28*x));
    }

    static void area(String figure, int x)
    {
        if (figure.equals("Квадрат"))
            System.out.println(x*x);
        if (figure.equals("Круг"))
            System.out.println((int)Math.ceil(3.14*x*x));
    }
}