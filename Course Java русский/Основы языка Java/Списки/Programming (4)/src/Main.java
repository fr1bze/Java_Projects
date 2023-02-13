import java.util.ArrayList;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        for (int i = 0; i < n; i ++)
            list.add(Integer.toString(i));
            list.remove(m);
            list.add(m,str);
            System.out.println(String.join(" ", list));
    }
}