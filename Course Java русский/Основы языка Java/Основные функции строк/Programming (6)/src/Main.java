import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean tr = true;
        String[] numbers = str.split("\\.");
        for (String num: numbers)
        {
            if (!(num.length() == 0  ||  num.isEmpty())) {
                if (numbers.length != 4) {
                    tr = false;
                    break;
                }
                if (Integer.parseInt(num) >= 0 && Integer.parseInt(num) <= 255)
                    continue;
                else {
                    tr = false;
                    break;
                }
            }
            else {
                tr = false;
                break;
            }

        }
        if (tr)
            System.out.println("YES");
        else System.out.println("NO");

    }
}