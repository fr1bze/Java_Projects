import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        boolean pin_code_coincided = true;
        while (counter != 5){
            String correct = sc.nextLine();
            String vasya = sc.nextLine();
            if(correct.equals(vasya)){
                System.out.println("CORRECT");
                break;
            }
            else {
                counter++;
                System.out.println("INCORRECT " + counter);
            }
            if (counter == 5) {
                pin_code_coincided = false;
                break;
            }
        }
        if (!pin_code_coincided){
            System.out.println("Error");
        }
    }
}