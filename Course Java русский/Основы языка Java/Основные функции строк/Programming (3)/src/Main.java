import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String result = "";
    String[] res = new String[n];
    for (int i = 0; i < n; i ++) {
        res[i] = sc.next();
    }
    String sep = sc.next();
            result = String.join(sep,res);
    System.out.println(result);
    }
}