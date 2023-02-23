import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set <T> result =  new HashSet<>();
        for (T set1It : set1)
        {
            if (!(set2.contains(set1It)))
                result.add(set1It);
        }
        for (T set2It : set2)
        {
            if (!(set1.contains(set2It)))
                result.add(set2It);
        }
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.addAll(Arrays.asList(new Integer[]{1,2,3}));
        set2.addAll(Arrays.asList(new Integer[]{0,2,4}));
        System.out.println(set1 + " " + set2);
        System.out.println(symmetricDifference(set1,set2).toString());
    }

}