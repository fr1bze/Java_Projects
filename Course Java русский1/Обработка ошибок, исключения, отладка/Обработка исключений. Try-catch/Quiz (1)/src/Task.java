import java.util.*;
import java.util.stream.Collectors;

public class Task {
  public static boolean uniqueOccurrences(int[] arr) {
    boolean result = true;
    Integer[] array = new Integer[arr.length];
    for (int i = 0; i < arr.length;i++)
      array[i] = arr[i];
    Map<Object, Integer> map = Arrays.stream(array)
            .collect(Collectors.toMap(e->e,e->1,Integer::sum));
    for (Integer v : map.values()){
      if (Collections.frequency(map.values(), v) > 1)
        result = false;
    }
    return result;
  }
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 2, 1, 1, 3};
    System.out.println(uniqueOccurrences(arr1));
  }
}
