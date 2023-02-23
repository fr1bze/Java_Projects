import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = 0;
        while (scanner.hasNextInt()){
            if (n % 2 != 0){
                list.add(scanner.nextInt());
            }
            else scanner.next();
            n++;
        }
        Collections.reverse(list);
        for (int j = 0; j < list.size(); ++j)
            System.out.print(list.get(j) + " ");
    }
}



