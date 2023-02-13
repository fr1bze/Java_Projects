import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        format_number(number);
    }

    static void format_number(String number)
    {
        if (number.length() != 11)
        {
            System.out.println("Неверное число символов");
            return;
        }
        char[] symb = number.toCharArray();
        for (int i = 0; i < symb.length;i++)
            if (!Character.isDigit(symb[i])) {
                System.out.println("Не все символы являются цифрами");
                return;
            }
        if (!(number.charAt(0) == '8'))
        {
            System.out.println("Это не российский номер телефона");
            return;
        }
        String str = number.charAt(0) + " (" + number.substring(1,4) + ") " + number.substring(4,7) + "-" +number.substring(7,9) + "-" +number.substring(9,11);
        System.out.println(str);

    }

}