import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder("");
        String temp = "";

        char[] chars = s.toCharArray();
        for (char symb : chars) {
            if (Character.isDigit(symb)) {
                temp += String.valueOf(symb);
            } else if (temp.length() > 0) {
                stringBuilder.append(Integer.toBinaryString(Integer.parseInt(temp)));
                stringBuilder.append(symb);
                temp = "";
            } else {
                stringBuilder.append(symb);
            }
        }

        if (temp.length() > 0) {
            stringBuilder.append(Integer.toBinaryString(Integer.parseInt(temp)));
        }
        System.out.println(stringBuilder);
    }
}