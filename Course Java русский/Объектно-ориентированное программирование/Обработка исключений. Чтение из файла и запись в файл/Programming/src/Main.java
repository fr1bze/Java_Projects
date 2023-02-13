import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        Calculator c = new Calculator();
        c.calculate(str);
    }
}


class Calculator {

    void calculate(String str){
        String[] s = str.split("\\s+");
        try{
            double a = Double.parseDouble(s[0]);
            String st = s[1];
            double b = Double.parseDouble(s[2]);
            if(st.equals("+")){
                System.out.println(a + b);
            }else if (st.equals("-"))
                System.out.println(a - b);
            else if (st.equals("*"))
                System.out.println(a * b);
            else if (st.equals("/")) {
                if(b == 0){
                    throw new Exception("Error! Division by zero");
                }
                System.out.println(a / b);
            }
            else throw new Exception("Operation Error!");
        }catch( NumberFormatException nfe){
            System.out.println("Error! Not number");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
