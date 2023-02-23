import java.util.HashMap;
import java.util.HashSet;

public class Candies {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for (int type: candyType)
        {
            set.add(type);
        }
        return set.size() < candyType.length/2? set.size() : candyType.length/2;
    }

    public static void main(String[] args) {
        Candies candies = new Candies();
        System.out.println(candies.distributeCandies(new int[]{6,6,6,6}));
        System.out.println(candies.distributeCandies(new int[]{1,1,2,2,3,3}));
        System.out.println(candies.distributeCandies(new int[]{1,1,2,3}));
        System.out.println(candies.distributeCandies(new int[]{1,1,2,3}));
        System.out.println(candies.distributeCandies(new int[] {1000,1000,2,1,2,5,3,1}));
    }
}
