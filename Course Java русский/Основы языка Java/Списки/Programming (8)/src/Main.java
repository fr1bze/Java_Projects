import java.util.ArrayList;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String>tracks = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (str.equals("push"))
                tracks.add(sc.next());
            if (str.equals("pop")) {
                System.out.println("Петя взял " + tracks.get(tracks.size() - 1));
                tracks.remove(tracks.size() - 1);
            }
        }
        System.out.println(String.join(" ",tracks));
    }
}