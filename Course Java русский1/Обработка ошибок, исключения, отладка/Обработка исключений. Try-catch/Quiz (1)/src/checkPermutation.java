import java.util.Arrays;
import java.util.Set;

public class checkPermutation {

    public boolean checkInclusion(String s1, String s2) {
        s1 = sort(s1);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (s1.equals(sort(s2.substring(i, i + s1.length()))))
                return true;
        }
        return false;
    }
    private static String sort(String str)
    {
        char[] t = str.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }

    public static void main(String[] args) {
        checkPermutation checkPermutation = new checkPermutation();
        System.out.println(checkPermutation.checkInclusion("ab","eidbaooo"));
        System.out.println(checkPermutation.checkInclusion("ab","eidboaoo"));
        System.out.println(checkPermutation.checkInclusion("ab","ab"));
        System.out.println(checkPermutation.checkInclusion("abc","bbbca"));
        System.out.println(checkPermutation.checkInclusion("isLander","isLander"));
    }
}
