import java.util.Arrays;

class DeleteUniques {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != nums[i-1])
            {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
         DeleteUniques deleteUniques = new DeleteUniques();
        System.out.println(deleteUniques.removeDuplicates(new int[] {1,1,2}));
        System.out.println(deleteUniques.removeDuplicates(new int[] {0,0,0,1,1,1,2,2,2,3,3,3,4}));
    }
}
