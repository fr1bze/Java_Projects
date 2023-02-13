import java.util.Scanner;

class MyProg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean palindrom = true;
        String st = sc.nextLine().replace(" ","");
        char[] str = st.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (Character.isLetter(str[i]) || Character.isDigit(str[i]))
                str[i] = Character.toLowerCase(str[i]);
        }
        for (int i = 0; i <= str.length/2;i++) {
            //System.out.println(str[i] + " " + str[str.length - i - 1]);
            if (str[i] == str[str.length - i - 1])
                continue;
            else {
                palindrom = false;
                break;
            }
        }
        System.out.println(palindrom?"YES":"NO");
    }
}