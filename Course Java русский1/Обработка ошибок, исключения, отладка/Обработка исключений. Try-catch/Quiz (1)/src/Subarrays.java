import java.util.Arrays;

public class Subarrays {
    public int findUnsortedSubarray(int[] nums) {
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        if (nums.length == 1)
            return 0;
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != sortedNums[i])
                flag = false;
        }
        if (flag)
            return 0;

        int start = 0, fin = nums.length - 1;
        for (int i = 0; i < nums.length ; i++) {
            if (sortedNums[i] != nums[i]) {
                start = i;
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (sortedNums[fin - i] != nums[fin - i]) {
                fin = fin - i;
                break;
            }
        }
       // System.out.println(Arrays.toString(sortedNums));
      //  System.out.println(Arrays.toString(nums));
        System.out.println(start + " " + fin);
        return fin - start + 1;
    }

    public static void main(String[] args) {
        int[] array1 = {2,6,4,8,10,9,15};
        int[] array2 = {9, 8, 7, 1, 2, 3};
        //int[] array3 = {1,2,3,4};
        //int[] array4 = {1};
        int[] array5 = {1,2,3,5,4};
        Subarrays subarrays = new Subarrays();
        System.out.println(subarrays.findUnsortedSubarray(array1));
        System.out.println(subarrays.findUnsortedSubarray(array2));
        //System.out.println(subarrays.findUnsortedSubarray(array3));
        //System.out.println(subarrays.findUnsortedSubarray(array4));
        System.out.println(subarrays.findUnsortedSubarray(array5));
    }
}
