class PalindromicSub {
    public String longestPalindrome(String s) {
        int left = 0, right;
        int maxLen = 0;
        String result = new String();

            for (int i = 0; i < s.length(); ++i) {
                left = i;
                right = i;
                while (left >= 0 && right < s.length() && (s.charAt(left) == s.charAt(right))) {
                    if (right - left + 1 > maxLen) {
                        maxLen = right - left + 1;
                        result = s.substring(left, right + 1);
                    }
                    left -= 1;
                    right += 1;
                }
                left = i;
                right = i + 1;
                while (left >= 0 && right < s.length() && (s.charAt(left) == s.charAt(right))) {
                    if (right - left + 1 > maxLen) {
                        maxLen = right - left + 1;
                        result = s.substring(left, right + 1);
                    }
                    left -= 1;
                    right += 1;
                }
            }

        return result;
    }

    public static void main(String[] args) {
        PalindromicSub palindromicSub = new PalindromicSub();
        System.out.println(palindromicSub.longestPalindrome("babad"));
       // System.out.println(palindromicSub.longestPalindrome("baba"));
        System.out.println(palindromicSub.longestPalindrome("cbbd"));
        System.out.println(palindromicSub.longestPalindrome("ac"));
    }
}