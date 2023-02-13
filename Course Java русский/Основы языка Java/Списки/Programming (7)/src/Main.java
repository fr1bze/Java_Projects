import java.util.ArrayList;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n+1 ; i++)
        {
            String[] str = sc.nextLine().split(" ");
            if (str[0].equals("Добавить"))
                list.add(str[1]);
            if (str[0].equals("Следующий!"))
                list.remove(0);
            if (str.length == 4) {
                if (str[1].equals("занимала")) {
                    list.add(list.indexOf(str[3])+1,str[0]);
                   // list.set(list.indexOf(str[0]), str[3]);
                }
            }
           // System.out.println(String.join(" ",list));
        }
       System.out.println(String.join(" ",list));
    }
}