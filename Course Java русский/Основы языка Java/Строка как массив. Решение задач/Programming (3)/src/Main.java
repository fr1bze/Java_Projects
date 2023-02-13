import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        for (int i = 0; i < str.length; i++)
            if (Character.isDigit(str[i]) || Character.isLetter(str[i]) || str[i] == ' ')
                System.out.print(str[i]);
    }
}