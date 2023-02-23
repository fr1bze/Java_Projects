import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task4 {
    public int threeSumClosest(int[] nums, int target) {
        int distance = 3000;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i; j < nums.length;j++)
            {
                for (int k = j; k < nums.length;k++)
                {
                    if (Math.abs(nums[i] + nums[j] + nums[k] - target) < distance)
                        distance = Math.abs(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(task4.threeSumClosest(nums,target));
    }
}