import java.util.Scanner;

class MyPro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        int count_dig = 0;
        int count_let = 0;
        for (int i = 0; i < str.length; i++)
        {
            if (Character.isDigit(str[i]))
            {
                count_dig++;
              //  System.out.println(count_dig + " count_dig");
            }
            else if (Character.isLetter(str[i])){
                count_let++;
             //   System.out.println(count_let + " count_let");
            }
            else continue;
        }
        System.out.println(count_dig > count_let? "Digit":count_dig == count_let? "Equal":"Letter");
    }
}