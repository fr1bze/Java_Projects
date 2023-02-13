import java.util.Arrays;
import java.util.Scanner;

class MyPr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().replace(" ", "").toLowerCase();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int max = 1;
        int counter = 1;
        char max_c = chars[0];

        //System.out.println(chars);
            for (int i = 0; i < chars.length - 1; i++) {
                if (chars[i] == chars[i + 1]) {
                    counter++;
                    //System.out.println(counter);
                    if (counter > max) {
                        max = counter;
                        max_c = chars[i];
                    }
                    continue;
                }
                counter = 1;
            }
            System.out.println(max_c + " " + max);
    }
}

