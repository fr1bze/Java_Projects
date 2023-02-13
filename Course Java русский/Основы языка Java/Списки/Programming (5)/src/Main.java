import java.util.ArrayList;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>(n);
        int m = sc.nextInt();
        for (int i = 0; i < n; i ++)
            list.add(Integer.toString(i));
        list.remove(m);
        System.out.println(String.join(" ",list));
    }
}