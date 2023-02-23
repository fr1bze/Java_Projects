public class Solution2 {
    public boolean isPalindrome(int x) {

        for (int i = 0; i < String.valueOf(x).length()/2; i++)
            if (String.valueOf(x).charAt(i) == String.valueOf(x).charAt(String.valueOf(x).length() - i-1)) {
            }
            else return false;
        return true;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int x = -121;
        int x2 = 1331;
        int x3 = -13531;
        System.out.println(solution2.isPalindrome(x));
        System.out.println(solution2.isPalindrome(x2));
        System.out.println(solution2.isPalindrome(x3));
    }
}