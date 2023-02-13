import java.util.Locale;
import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] text = new String[n];
        for (int i = 0; i < n; i++)
            text[i] = sc.nextLine();
        int m = sc.nextInt();
        sc.nextLine();
        String[] rep = new String[m];
        String[] old_w = new String[2*m], new_w = new String[2*m];
        for (int i = 0; i < m; i++) {
            rep[i] = sc.nextLine();
            old_w[i] = rep[i].split(" - ")[0].substring(0, 1).toLowerCase() + rep[i].split(" - ")[0].substring(1);
            new_w[i] = rep[i].split(" - ")[1].substring(0, 1).toLowerCase() + rep[i].split(" - ")[1].substring(1);
            old_w[m + i] = rep[i].split(" - ")[0].substring(0, 1).toUpperCase() + rep[i].split(" - ")[0].substring(1);
            new_w[m + i] = rep[i].split(" - ")[1].substring(0, 1).toUpperCase() + rep[i].split(" - ")[1].substring(1);
        }
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < 2*m; j++) {
               text[i] = text[i].replace(old_w[j], new_w[j]);
           }
           System.out.println(text[i]);
            }
    }
}