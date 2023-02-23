// You can experiment here, it won’t be checked

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task {
  public static void main(String[] args) {
    Set<String> set = new LinkedHashSet<>();
// add some elements to the set
    set.add("First");
    set.add("Second");
    set.add("Third");
    set.add("Fifth");
    set.add("Fourth");
    Iterator<String> iterator = set.iterator();
    iterator.forEachRemaining(System.out::println);
  }
}
