import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int counter = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0' || chars[i] == '6' || chars[i] == '9')
                counter++;
            if (chars[i] == '8')
                counter += 2;
        }
        System.out.println(counter);
    }
}