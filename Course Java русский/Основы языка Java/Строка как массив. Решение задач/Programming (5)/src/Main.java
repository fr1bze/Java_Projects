import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max_length = 0;
        String[] str = sc.nextLine().split(" ");
        for (String words: str)
            if (words.length() > max_length)
                max_length = words.length();
        System.out.println(max_length);

    }
}