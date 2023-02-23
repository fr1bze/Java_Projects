public class Subarray {
    public int subArray(int[] arr)
    {
        int best = 0, sum = 0;
        int[] result = new int[arr.length];
        for (int i = 0 ; i < arr.length; i++)
        {
            sum = Math.max(arr[i],sum + arr[i]);
            best = Math.max(best,sum);
        }
        return best;
    }

    public static void main(String[] args) {
        int[] array1 = {1,5,4,-3,2,10,12,-5,-7,4};
        int[] array2 = {1,5,4,-3,2};
        int[] array3 = {1,-5,-4,-3,2};
        Subarray subarray = new Subarray();
        System.out.println(subarray.subArray(array1));
        System.out.println(subarray.subArray(array2));
        System.out.println(subarray.subArray(array3));
    }
}
