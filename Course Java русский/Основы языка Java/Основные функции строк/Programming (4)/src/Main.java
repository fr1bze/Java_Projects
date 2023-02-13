import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String n = sc.next();
        int ind1 = str.indexOf(n);
        int ind2 = str.lastIndexOf(n);
        System.out.print(ind1 +"\n" + ind2);

    }
}