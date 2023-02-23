import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> map =  new HashMap<>();
        for (int i = 0; i < nums.length;i++)
        {
            if (map.containsKey(target-nums[i])) {
                arr[1] = i;
                arr[0] = map.get(target - nums[i]);
            }
            map.put(nums[i],i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,3};
        int target = 6;
        System.out.println(solution.twoSum(nums,target)[0] + " " + solution.twoSum(nums,target)[1]);
    }
}