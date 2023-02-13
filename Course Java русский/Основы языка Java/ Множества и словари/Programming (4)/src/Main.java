import java.util.HashSet;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> uniq_num = new HashSet<Integer>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            uniq_num.add(sc.nextInt());
        System.out.println(uniq_num.size());
    }
}