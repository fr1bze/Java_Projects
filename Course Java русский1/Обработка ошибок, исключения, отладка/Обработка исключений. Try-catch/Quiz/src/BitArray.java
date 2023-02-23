public class BitArray {
    public int longestNiceSubarray(int[] nums) {
        int AND = 0, i = 0, res = 0, n = nums.length;
        for (int j = 0; j < n; ++j) {
            while ((AND & nums[j]) > 0)
                AND ^= nums[i++];
            AND |= nums[j];
            res = Math.max(res, j - i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        BitArray bitArray = new BitArray();
        System.out.println(bitArray.longestNiceSubarray(new int[]{1,3,8,48,10}));
        System.out.println(bitArray.longestNiceSubarray(new int[]{3,1,5,11,13}));
        System.out.println(bitArray.longestNiceSubarray(new int[]{1}));
        System.out.println(bitArray.longestNiceSubarray(new int[]{6,1}));
        System.out.println(bitArray.longestNiceSubarray(new int[]{744437702,379056602,145555074,392756761,560864007,934981918,113312475,1090,16384,33,217313281,117883195,978927664}));

    }
}

