import java.util.Arrays;

public class Solution3 {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(result) != 0) {
                System.out.println(strs[i].indexOf(result));
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty())
                    return "";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        String[] strs = {"flower","flow","flight"};
      //  String[] strs2 = {"flower","flow","flight","fl"};
        System.out.println(solution3.longestCommonPrefix(strs));
      //  System.out.println(solution3.longestCommonresult(strs2));
    }
}
