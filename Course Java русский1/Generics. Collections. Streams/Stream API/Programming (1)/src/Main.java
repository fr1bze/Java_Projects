import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = new ArrayList<>();
        list = stream.sorted(order).collect(Collectors.toList());
        if (list.size() != 0)
            minMaxConsumer.accept(list.get(0),list.get(list.size()-1));
        else minMaxConsumer.accept(null,null);

    }

    public static void main(String[] args) {
            findMinMax(
                    Stream.of(9, 6, 8, 3, 19, 16, 18, 13),
                    Integer::compareTo,
                    (v1, v2) -> System.out.println("max = " + v2 + "\nmin = " + v1)
            );
        }
}