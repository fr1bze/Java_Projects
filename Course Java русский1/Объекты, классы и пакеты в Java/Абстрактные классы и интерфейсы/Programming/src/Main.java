// public static double integrate(DoubleUnaryOperator f, double a, double b) {
//        double n = 10000000;
//        double h = Math.abs(b - a) / n;
//        double result = 0;
//        //f = (s) -> Math.sin(s);
//        for(int i = 0; i < n; i++) {
//            result +=  f.applyAsDouble(a + h * i);
//        }
//        return result *= h;
//    }

class A extends B {
    int a = 3;
}

class B {
    int b = 3;
}

public class Main {
    public static void main(String[] args) {
        A classA = new A();
        B classB = new B();
        A classc = (A) classB;
    }
}