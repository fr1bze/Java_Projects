import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String height;
    String name;
    int n = sc.nextInt();
    int min = 200;
    int max = 0;
    int height_t;
        String min_height = "";
        String max_height = "";
    for (int i = 0; i < n ; i++ )
    {
        name = sc.next();
        height = sc.next();
        height_t = Integer.parseInt(height);

        if (height_t > max)
        {
            max = height_t;
            max_height = name;
        }
        if (height_t < min)
        {
            min = height_t;
            min_height = name;
        }
    }
        System.out.println(min_height + "\n" + max_height);
    }
}