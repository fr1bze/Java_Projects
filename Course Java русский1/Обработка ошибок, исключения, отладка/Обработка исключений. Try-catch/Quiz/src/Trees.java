import java.util.HashMap;

public class Trees {
        public int totalFruit(int[] fruits) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int left = 0, right = 0;
            for (right = 0; right < fruits.length; ++right)
            {
                map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
                if (map.size() > 2) {
                    map.put(fruits[left], map.get(fruits[left]) - 1);
                    if (map.get(fruits[left]) == 0)
                        map.remove(fruits[left]);
                    left++;
                }

            }
            return right - left;
        }

    public static void main(String[] args) {
        Trees trees = new Trees();
        System.out.println(trees.totalFruit(new int[] {1,1,3,5,2,1}));
        System.out.println(trees.totalFruit(new int[] {1,1,1,2,3}));
        System.out.println(trees.totalFruit(new int[] {0,1,1,2}));
        System.out.println(trees.totalFruit(new int[] {1,2,2}));
        System.out.println(trees.totalFruit(new int[] {1,2,1}));
        System.out.println(trees.totalFruit(new int[] {1,2,3,2,2}));
    }
}