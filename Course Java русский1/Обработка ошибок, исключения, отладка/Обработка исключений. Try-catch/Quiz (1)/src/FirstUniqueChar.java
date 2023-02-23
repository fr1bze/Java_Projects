public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++)
        {
            if (s.lastIndexOf(s.charAt(i)) != i)
            {
                //System.out.println("Произошла замена символа " + s.charAt(i) + " на \'_\' на шаге " + i);
                s = s.replace(s.charAt(i),'3');
              //  System.out.println(s + " " + s.lastIndexOf(s.charAt(i)) + " " + i);
            }
        }
        for (int i = 0; i < s.length();i++)
            if (s.charAt(i) != '3')
                return i;
        return -1;
    }
    public static void main(String[] args) {
        //leetcode
        // l - 1, e - 3, t - 1, c - 1, o - 1, d - 1
        FirstUniqueChar firstUniqueChar = new FirstUniqueChar();
        System.out.println(firstUniqueChar.firstUniqChar("loveleetcode"));
    }
}
