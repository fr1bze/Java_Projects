import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(digit_count(s));
    }
        static int digit_count(String s)
        {
            int count = 0;
            char[] str = s.toCharArray();
            for (int i = 0; i < str.length;i++)
                if (Character.isDigit(str[i]))
                    count++;
            return count;
        }
}