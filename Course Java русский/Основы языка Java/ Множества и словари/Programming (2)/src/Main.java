import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        String max_coun = " ";
        HashMap<String, Integer> counter = new HashMap<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            if (counter.containsKey(str)) {
               counter.put(str,counter.get(str)+1);

            }else counter.put(str,1);
        }
        for (String keys: counter.keySet())
        {
            if (counter.get(keys) > max) {
                max = counter.get(keys);
                max_coun = keys;
            }
        }
        System.out.println(max_coun);
    }
}