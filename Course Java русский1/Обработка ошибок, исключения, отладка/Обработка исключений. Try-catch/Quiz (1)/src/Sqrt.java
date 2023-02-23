public class Sqrt {
    public int mySqrt(int x) {
        int left = 0, right = x;
        long ans = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (mid * mid < x) {
                left = (int) (mid + 1);
                ans = mid;
                System.out.println(ans + "left " + left + " right " + right);
            }
            else if (mid * mid > x)
                right = (int) (mid - 1);
            else
                return (int) mid;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
            Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(10));
        System.out.println(sqrt.mySqrt(6));
        System.out.println(sqrt.mySqrt(8));
        System.out.println(sqrt.mySqrt(5));
        System.out.println(sqrt.mySqrt(17));
        System.out.println(sqrt.mySqrt(15));

    }
}
