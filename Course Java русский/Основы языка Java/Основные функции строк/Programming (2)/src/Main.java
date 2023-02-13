import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String word1 = sc.nextLine();
            String word2 = sc.nextLine();
            String text= sc.nextLine();
            String new_text = text.replaceAll(word1, word2);
            System.out.println(new_text);
    }
}