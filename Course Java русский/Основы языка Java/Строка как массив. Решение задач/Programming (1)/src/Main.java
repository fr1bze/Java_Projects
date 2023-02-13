import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] symb = str.toCharArray();
        String ch = sc.next();
        char c = ch.charAt(0);
        int counter = 0;
        for (int i = 0; i < symb.length; i++)
            if ((symb[i] == Character.toLowerCase(c)) || (symb[i] == Character.toUpperCase(c)))
                counter++;
        System.out.println(counter);
    }
}