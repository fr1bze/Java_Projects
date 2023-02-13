import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str;
    int counter = 0;
    int temp = 0;
    boolean is_stop = false;
    for (;sc.hasNext();)
    {
        str = sc.next();
        if (!str.equals("ээээ") && !str.equals("потом") && !str.equals("СТОП"))
        {
            counter++;
            //System.out.println(counter);
        }
        //Проверка на куб
        if (str.equals("Куб") )
        {
            temp = counter;
        }
        if(str.equals("СТОП"))
        {
            if (temp == 0)
            {
                System.out.println("NO");
            }
            break;
        }
    }
        if (temp != 0)
        System.out.println(temp);
    }
}