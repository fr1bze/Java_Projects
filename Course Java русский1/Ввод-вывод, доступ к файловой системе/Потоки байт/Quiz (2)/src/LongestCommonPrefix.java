import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String min = strs[0];
        for (int i = 1; i < strs.length; ++i)
        {
           while (strs[i].indexOf(min) != 0)
           {
               min = min.substring(0,min.length() - 1);

           }
        }
        return min;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"reflower","flow","flight"}));
    }
}

class LongestCommonPrefixNew extends LongestCommonPrefix{
    @Override
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String minS = strs[0];
        String maxS = strs[strs.length-1];
        String result = "";
        int index = 0;
        while (index < minS.length())
        {
            if (minS.substring(0,index).equals(maxS.substring(0,index)))
                result = minS.substring(0,index);
            index++;
        }
        if (strs.length == 1)
            return "";
        return result;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefixNew = new LongestCommonPrefixNew();
        System.out.println(longestCommonPrefixNew.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefixNew.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefixNew.longestCommonPrefix(new String[]{"reflower","flow","flight"}));
    }
}
