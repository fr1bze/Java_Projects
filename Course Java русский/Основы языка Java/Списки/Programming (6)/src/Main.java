import java.util.ArrayList;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String>tracks = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (str.equals("push"))
                tracks.add(sc.next());
            if (str.equals("pop")) {
                System.out.println("воспроизводится " +  tracks.get(0));
                tracks.remove(0);
            }
        }
        System.out.println(String.join(" ",tracks));
    }
}