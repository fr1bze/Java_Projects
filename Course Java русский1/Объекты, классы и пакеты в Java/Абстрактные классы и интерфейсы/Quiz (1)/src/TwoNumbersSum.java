import java.util.Arrays;

public class TwoNumbersSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0, right = numbers.length-1;
        while (left < right)
        {
            if (numbers[left]  + numbers[right] > target)
                --right;
            else if (numbers[left]  + numbers[right] < target)
                left++;
            else {
                result = new int[]{left + 1, right + 1};
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
//        System.out.println(Arrays.toString(twoNumbersSum.twoSum(new int[] {2,7,11,15},9)));
//        System.out.println(Arrays.toString(twoNumbersSum.twoSum(new int[] {2,3,4},6)));
//        System.out.println(Arrays.toString(twoNumbersSum.twoSum(new int[] {-1,0},-1)));
        System.out.println(Arrays.toString(twoNumbersSum.twoSum(new int[] {1,4,5,9,12,100}, 21)));
    }
}
