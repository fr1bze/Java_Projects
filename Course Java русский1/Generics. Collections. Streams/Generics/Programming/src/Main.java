import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

class Pair <F,S> {
    private final F first;
    private final S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <F,S> Pair of(F first, S second) {
        Pair pair = new Pair(first,second);
        return pair;
    }


    public F getFirst() {
        return this.first;

    }

    public S getSecond() {
        return this.second;
    }

    //@Override
    public boolean equals(Pair <F,S> pair) {
        return Objects.equals(this.getFirst(), pair.getFirst()) && Objects.equals(this.getSecond(),pair.getSecond());
    }


    @Override
    public int hashCode() {
        int result = first.hashCode();
        result = 31 * result + second.hashCode();
        return result;
    }

}
public class Main {

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        System.out.println(i + " " + s);

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        System.out.println("Pair 2 " + pair2.getFirst() + " " + pair2.getSecond());
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println("hashcode " + mustAlsoBeTrue);
        Collection<?> collection = new ArrayList<>();
        Object obj = new Object();
        collection.size();
        //collection.add(obj);
        collection.clear();
        collection.contains(obj);
        collection.remove(obj);
        collection.iterator();
        collection.toArray();


    }
}