class Palindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        for (int i = 0; i < s.length()/2; i++)
        {
            System.out.println(s.charAt(i) + " " + s.charAt(s.length() - i - 1));
            if (((Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)) ) && (Character.isDigit(s.charAt(s.length() - i - 1))  || Character.isLetter(s.charAt(s.length() - i - 1)) ) && s.charAt(i) == s.charAt(s.length() - i - 1)))
            {
                System.out.println("equals");
            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("1a2"));
    }
}