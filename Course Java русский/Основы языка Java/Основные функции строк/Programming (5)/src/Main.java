import java.util.Locale;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        String o = sc.next();
        int n_o = 0;
        int n_m = 0;
        while (sc.hasNext()){
            String str = sc.next().toLowerCase();
            if (str.startsWith(m) && str.endsWith(o))
                n_o++;
            if (str.startsWith(o) && str.endsWith(m))
                n_m++;
        }
        System.out.print(n_o + "\n" + n_m);
    }
}