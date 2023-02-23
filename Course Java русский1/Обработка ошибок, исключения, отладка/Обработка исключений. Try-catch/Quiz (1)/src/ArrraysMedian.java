import java.util.Arrays;
import java.util.stream.IntStream;

class ArraysMedian {
    public static int[] join(int[] a, int[] b)
    {
        return Arrays.stream(IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .toArray()).sorted().toArray();
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return (nums1.length + nums2.length) % 2 != 0? (double) join(nums1,nums2)[(nums1.length + nums2.length - 1)/2]:
                (double) (join(nums1,nums2)[(nums1.length + nums2.length - 1)/2] + join(nums1,nums2)[(nums1.length + nums2.length - 1)/2 + 1])/2;
    }


    public static void main(String[] args) {
        ArraysMedian arraysMedian = new ArraysMedian();
        System.out.println(arraysMedian.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }
}
