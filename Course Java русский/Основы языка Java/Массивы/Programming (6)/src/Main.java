import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int counter = 0;
        boolean[] flg = new boolean[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0 ; j <n;j ++) {
                if (arr[i] == arr[j] && i != j) {
                    flg[i] = true;
                }
            }
        for (int i = 0; i < n;i++) {
            if (flg[i] == false)
                System.out.println(arr[i]);
        }
    }
}