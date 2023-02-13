import java.util.HashMap;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++ ) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            map.put(s1,s2);
            map.put(s2,s1);
        }
        String word = sc.nextLine();
        if (map.containsKey(word))
            System.out.println(map.get(word));
    }
}