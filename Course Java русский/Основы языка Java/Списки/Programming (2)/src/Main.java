
import java.util.ArrayList;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n + 2;i++) {
            if (i == 0 || i == n + 1)
                list.add("1");
            else list.add("0");
        }
        System.out.println(String.join(" ",list));
    }
}