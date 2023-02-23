import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class SingleNumbers {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> counter = new HashMap<>();
        for (int i = 0; i < n; ++i)
        {
            if (!counter.containsKey(nums[i]))
            {
                counter.put(nums[i],1);
            }
            else counter.put(nums[i],counter.get(nums[i])+1);
        }
        for (Integer key: counter.keySet())
        {
            if (counter.get(key) == 1)
                arr.add(key);
        }
        int[] array = new int[arr.size()];
        for (int i = 0; i < array.length;i++)
            array[i] = arr.get(i);
        return array;
    }

    public int[] singleNumberVersionTwo(int[] nums) {
        int result[] = new int[2];
        int xor = nums[0];
        for (int i=1; i<nums.length; i++)
        {
            xor ^= nums[i];
        }

        int bit = xor & ~(xor-1);
        int num1 = 0;
        int num2 = 0;

        for (int num : nums)
        {
            if ((num & bit) > 0)
            {
                num1 ^= num;
            }
            else
            {
                num2 ^= num;
            }
        }

        result[0] = num1;
        result[1] = num2;
        return result;
    }

    public static void main(String[] args) {
        SingleNumbers singleNumbers = new SingleNumbers();
        System.out.println(Arrays.toString(singleNumbers.singleNumber(new int[]{1,2,1,3,2,5})));
        System.out.println(Arrays.toString(singleNumbers.singleNumber(new int[]{0,1})));
        System.out.println(Arrays.toString(singleNumbers.singleNumber(new int[]{0,-1})));
        System.out.println(Arrays.toString(singleNumbers.singleNumber(new int[]{1,2,3,4,5,6})));
        System.out.println("+++++++++++++++++++++=");
        System.out.println(Arrays.toString(singleNumbers.singleNumberVersionTwo(new int[]{1,2,1,3,2,5})));
        System.out.println(Arrays.toString(singleNumbers.singleNumberVersionTwo(new int[]{0,1})));
        System.out.println(Arrays.toString(singleNumbers.singleNumberVersionTwo(new int[]{0,-1})));
        System.out.println(Arrays.toString(singleNumbers.singleNumberVersionTwo(new int[]{1,1,2,3,2,3,4,5})));
    }
}