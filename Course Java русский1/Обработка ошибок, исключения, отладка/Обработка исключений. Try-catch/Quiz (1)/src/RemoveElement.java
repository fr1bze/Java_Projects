import java.util.Arrays;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int counter = 0;
        for (int i = 0; i < n; i++)
        {
            if (val != nums[i]) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return counter;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(new int[]{3, 2, 2, 3}, 2));
        System.out.println(removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}