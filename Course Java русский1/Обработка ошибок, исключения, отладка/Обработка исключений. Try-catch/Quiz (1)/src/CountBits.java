import java.util.Arrays;

public class CountBits {
    static int count(int n){
        int count = 0;
        while(n!=0){
            if((n&1) == 1){  /// eg 1&1 == 1, 1&0 == 0 . its an and operator
                count++;
            }
            n =  n>>1;  //decrease the binary number by 1 after each counting by using shift operator.
        }
        return count;
    }

    public int[] countBits(int n) {
        int[] resarr = new int[n+1];
        resarr[0] = 0;
        for (int i = 1; i <= n;i++)
        {
                resarr[i] = count(i);

            //resarr[i] = Integer.parseInt(String.valueOf((toBinary(i).charAt(0))));
        }
        return resarr;
    }
    public static void main(String[] args) {
        CountBits countBits = new CountBits();

        System.out.println(count(5));
        System.out.println(Arrays.toString(countBits.countBits(5)));
    }
}
