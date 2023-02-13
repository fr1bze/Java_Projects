import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; arr[i] = sc.nextInt(), i++);
        for (int i = 0; i < arr.length; i++)
            if (arr[i] >= a && arr[i] <= b)
            {
                System.out.println((int)Math.pow(arr[i],3));
            } else System.out.println("Error");
    }
}