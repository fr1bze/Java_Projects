import java.util.HashSet;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> uniq_num = new HashSet<String>();
        int n = sc.nextInt();
        sc.nextLine();
        String text = " ";
        for (int i = 0; i < n; i++)
        {
            text = sc.nextLine();
            String[] str = text.substring(0, text.length()).split(" ");
            for (int j = 0;  j < str.length; j++)
                uniq_num.add(str[j]);
    }
        System.out.println(uniq_num.size());
    }
}