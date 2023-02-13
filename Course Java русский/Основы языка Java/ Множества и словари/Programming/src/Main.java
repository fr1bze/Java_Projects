import java.util.ArrayList;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        int k = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++)
            list.add(Integer.toString(i));
        for (int i = 0; i < k ; i++)
        {
            String[] str = sc.nextLine().split(" ");
            list.add(Integer.parseInt(str[1]),str[0]);
            //System.out.println(str[0] + " " + str[1]);
        }
        System.out.println(String.join(" ",list));
    }
}