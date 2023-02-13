import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    boolean is_cube = false;
    for(; ;)
    {
        if(str.equals("Куб"))
        {
            is_cube = true;
        }
        if (str.equals("СТОП"))
        {
            break;
        }
        str = sc.nextLine();
    }
    if(is_cube) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
    }
}