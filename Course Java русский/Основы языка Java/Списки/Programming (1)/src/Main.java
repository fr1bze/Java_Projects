import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().toLowerCase().split(" ");
        int counter = 0;
        for (int i = 0; i < str.length;i++)
        if (str[i].equals("повторение"))
                counter++;
        if (counter > 0)
            System.out.println("YES");
        else System.out.println("NO");
    }
}