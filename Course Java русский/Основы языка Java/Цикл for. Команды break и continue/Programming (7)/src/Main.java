import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int p = 1, counter = 0;
        boolean is_stop = false;
        for (; sc.hasNext(); ) {
            s = sc.nextLine();
            if (s.equals("СТОП")) {
                break;
            }
            int n = Integer.parseInt(s);
            if (n != 0) {
                counter++;
                p *= n;
            }
            }
        if(counter >= 1)
        {
            System.out.println(p);
        }
        else System.out.println("Не найдено");
        }

    }