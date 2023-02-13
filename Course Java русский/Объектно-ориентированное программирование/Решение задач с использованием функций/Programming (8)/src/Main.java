import java.util.ArrayList;
import java.util.Scanner;

class Programm1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        generator(n,k);
    }

    static void generator(int n, int k)
    {
        ArrayList<String> keys = new ArrayList<>();
        for (int i = 1; i <=k; i++)
            keys.add(i + "");
      //  System.out.println(keys);
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = (int)Math.pow(10,n-1); i <= Math.pow(10,n) - 1;i++) {
            String number = Integer.toString(i);
            int counter = 0;
            for (int j = 0; j < number.length(); j++) {
                if (keys.contains(Character.toString(number.charAt(j))))
                    counter++;
                if (counter == number.length()) {
                    for (int d = 0; d < number.length(); d++)
                        numbers.add(Character.toString(number.charAt(d)));
                }
            }
            counter = 0;
        }
       // System.out.println(numbers);
        for (int i = 0; i < numbers.size();i+=n)
            System.out.println(String.join("",numbers).substring(i,n + i).replace(""," ").trim());
    }

}