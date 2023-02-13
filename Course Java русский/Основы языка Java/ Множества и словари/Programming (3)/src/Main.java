import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashMap<String,String> jobs = new LinkedHashMap<>();
        HashMap<String,Integer> count = new HashMap<>();
        sc.nextLine();
        int max = 0;
        String max_key = "";
        for (int i = 0; i < n; i++) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            jobs.put(str1, str2);
           // System.out.println(jobs + " " + count);
            if (count.containsKey(str2))
            {
                count.put(str2,count.get(str2)+1);
            }
            else count.put(str2,1);
        }
        for (String keys: count.keySet()) {
            if (count.get(keys) > max) {
                max = count.get(keys);
                max_key = keys;
            }
        }
        //System.out.println(jobs);
        //System.out.println(count);
        System.out.println(max + "\n" + max_key);
        for (String key : jobs.keySet())
            if (max_key.equals(jobs.get(key))                               )
                System.out.println(key);
    }
}