import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt(), H = sc.nextInt();
        int w = sc.nextInt(), h = sc.nextInt();
        change(W, H, w, h);
    }

    static void change(int W, int H, int w, int h) {
        boolean isSwap = false;
        if (Math.abs(W - w) + Math.abs(H - h) > Math.abs(W - h) + Math.abs(H - w)) {
            int tmp = H;
            H = W;
            W = tmp;
            isSwap = true;
        }
        int result = 0;
        if (isSwap) {
            while ((W >= w) && (H >= h)) {

                if (W % 2 == 0 && W / 2 > w) {
                    W = (int) Math.ceil((W / 2.0));
                    result += 1;
                } else if (W % 2 == 0 && W / 2 < w && (W > h)) {
                    W -= 2;
                    result += 1;
                } else if (W % 2 != 0 && W / 2 >= w && (W > h)) {
                    W = (int) Math.ceil(W / 2.0);
                    result += 1;
                } else if (W % 2 != 0 && W / 2 < w && (W > h)) {
                    W = W - 2;
                    result++;
                }

                //H
                if (H % 2 == 0 && H / 2 > h) {
                    H = (int) Math.ceil((H / 2.0));
                    result += 1;
                } else if (H % 2 == 0 && H / 2 < h && (H > w)) {
                    H -= 2;
                    result += 1;
                } else if (H % 2 != 0 && H / 2 >= h && (H > w)) {
                    H = (int) Math.ceil(H / 2.0);
                    // System.out.println(H);
                    result += 1;
                } else if (H % 2 != 0 && H / 2 < h && (H > w)) {
                    H = H - 2;
                    result++;
                } else {
                    break;
                }
            }
        } else {
            while ((W >= w) && (H >= h)) {

                if (W % 2 == 0 && W / 2 > w) {
                    W = (int) Math.ceil((W / 2.0));
                    result += 1;
                } else if (W % 2 == 0 && W / 2 < w && (W > w)) {
                    W -= 2;
                    result += 1;
                } else if (W % 2 != 0 && W / 2 >= w && (W > w)) {
                    W = (int) Math.ceil(W / 2.0);
                    result += 1;
                } else if (W % 2 != 0 && W / 2 < w && (W > w)) {
                    W = W - 2;
                    result++;
                }

                //H
                if (H % 2 == 0 && H / 2 >= h) {
                    H = (int) Math.ceil((H / 2.0));
                    result += 1;
                } else if (H % 2 == 0 && H / 2 < h && (H > h)) {
                    H -= 2;
                    result += 1;
                } else if (H % 2 != 0 && H / 2 >= h && (H > h)) {
                    H = (int) Math.ceil(H / 2.0);
                    // System.out.println(H);
                    result += 1;
                } else if (H % 2 != 0 && H / 2 < h && (H > h)) {
                    H = H - 2;
                    result++;
                } else {
                    break;
                }
            }
        }
        if (result == 0)
            System.out.println(-1);
        else System.out.println(result);
    }
}


