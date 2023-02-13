import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int max = 0;
        String max_key = "";
        HashMap<String, ArrayList<String>> names = new HashMap<>();
        HashMap<String,Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            String[] str = sc.nextLine().toLowerCase().replace(";", "").split(" ");
            ArrayList<String> word_list = new ArrayList<>();
            for (int j = 1; j < str.length;j++) {
                word_list.add(str[j]);
            }
            names.put(str[0], word_list);
        }
        int k = sc.nextInt();
        for (String keys: names.keySet()) {
            HashSet<String> uniq_words = new HashSet<>();
            for (String s : names.get(keys)) {
                if (s.length() >= k)
                uniq_words.add(s);
            }
            count.put(keys, uniq_words.size());
        }
        for (String key : count.keySet())
            if (count.get(key) > max)
            {
                max = count.get(key);
                max_key = key;
            }

        System.out.println(max_key.substring(0,1).toUpperCase() +max_key.substring(1,max_key.length()-1)  + " " + max);
    }
    }
