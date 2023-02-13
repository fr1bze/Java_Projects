import java.util.ArrayList;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        String temp = " ";
        for (int i = 0; i < n; i++)
        {
            String[] str = sc.nextLine().split(" ");
            if(str[0].equals("Стоит")) {
                if (list.size() < 5)
                    list.add(str[str.length - 1]);
                else System.out.println("Слабак!");
            }
            if (str[0].equals("Добавить")) {
                list.add(str[1]);
                System.out.println(str[1] + " в очереди");
            }
            if (str[0].equals("Следующий!") && list.size() != 0) {
                System.out.println(list.get(0) + " в обработке");
                temp = list.get(0);
                list.remove(0);
            }
            else if (str[0].equals("Следующий!") && list.size() == 0)
                System.out.println("Отлично, попью чаёк!");
            if (str.length == 4) {
                if ((str[1].equals("занимала")) && (list.contains(str[3])))
                    list.add(list.indexOf(str[3])+1,str[0]);
                    // list.set(list.indexOf(str[0]), str[3]);
                    else if (str[1].equals("занимала") && !list.contains(str[3]) && temp.equals(str[3]))
                    {
                        list.add(list.indexOf(str[3])+1,str[0]);
                    }
                    else if (str[1].equals("занимала") && !list.contains(str[3]) && !temp.equals(str[3]))
                {
                    System.out.println(str[0] + ", не надо тут ля-ля");
                    list.add(str[0]);
                }

            }
            if (str[0].equals("Посмотреть") && list.size()!=0)
                System.out.println(String.join(" ",list));
             if (str[0].equals("Посмотреть") && list.size()==0)
                System.out.println("*прокатилось перекати-поле*");
            // System.out.println(String.join(" ",list));
        }


    }
}