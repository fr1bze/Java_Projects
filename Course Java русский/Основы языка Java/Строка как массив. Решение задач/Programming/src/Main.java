import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int counter = 0;
        char[] symb = str.toCharArray();
        for (int i = 0; i < symb.length; i++)
            if (symb[i] == 'f')
                counter++;
        System.out.println(counter);
    }
}