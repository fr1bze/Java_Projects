import java.util.HashMap;

public class UniqueSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left = 0; int right = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int n =s.length();
        int max = 0;
        while(right < n) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.get(c) > 1)
            {
                char l = s.charAt(left);
                map.put(l,map.get(l) - 1);
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        UniqueSubstring uniqueSubstring = new UniqueSubstring();
        System.out.println(uniqueSubstring.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(uniqueSubstring.lengthOfLongestSubstring("bbbbb"));
        System.out.println(uniqueSubstring.lengthOfLongestSubstring("pwwkew"));
        System.out.println(uniqueSubstring.lengthOfLongestSubstring("pwwkkee"));
        System.out.println(uniqueSubstring.lengthOfLongestSubstring("abcdabcdae"));
        System.out.println(uniqueSubstring.lengthOfLongestSubstring(""));
        System.out.println(uniqueSubstring.lengthOfLongestSubstring("aab"));
        System.out.println(uniqueSubstring.lengthOfLongestSubstring("abca"));
        System.out.println(uniqueSubstring.lengthOfLongestSubstring("abba"));
        System.out.println(uniqueSubstring.lengthOfLongestSubstring("dvdf"));

    }
}
