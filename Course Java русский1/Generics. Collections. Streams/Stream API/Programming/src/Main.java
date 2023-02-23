import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static int mid(int x) {
        return (x / 10) % 1000;
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n->mid(n*n)).limit(seed);
    }

    public static void main(String[] args) {
        pseudoRandomStream(13).limit(13).mapToObj(x -> " " + x).forEach(System.out::print);
    }
}
