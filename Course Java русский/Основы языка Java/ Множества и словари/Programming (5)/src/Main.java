import java.util.HashSet;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isAdded = false;
        HashSet<Integer> nums = new HashSet<>();
        for (int i = 0; i < n; i++)
        {
            isAdded = nums.add(sc.nextInt());
            if (isAdded)
                System.out.println("NO");
            else System.out.println("YES");
        }
    }
}