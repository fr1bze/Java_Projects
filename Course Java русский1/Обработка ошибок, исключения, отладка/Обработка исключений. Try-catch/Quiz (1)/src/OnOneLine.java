import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Point {
    public int x;
    public int y;
    Point(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
}

public class OnOneLine {
//    public int[][] sortDualArray(int[][] points)
//    {
//        int[][] sortedArray = new int[points.length][2];
//        for (int i = 0; i < points.length;i ++)
//        {
//            for (int j = 0; j < 2;j++)
//                sortedArray[i][j] = points[i][j];
//        }
//        int tmpX,tmpY;
//        for (int i = 0; i < points.length;i++) {
//            for (int j = i; j < points.length; j++)
//            {
//                if (sortedArray[i][0] > sortedArray[j][0]) {
//                    tmpX = sortedArray[j][0];
//                    tmpY = sortedArray[j][1];
//                    sortedArray[j][0] = sortedArray[i][0];
//                    sortedArray[j][1] = sortedArray[i][1];
//                    sortedArray[i][0] = tmpX;
//                    sortedArray[i][1] = tmpY;
//                }
//
//            }
//        }
//        return sortedArray;
//    }

    // basic idea
    // 1. use HashMap to record number of points which has same k
    // 2. special case: k does not exist (x1 == x2)
    // two points with same x and y are considered as different ones
    public int maxPoints(Point[] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            // choose current point as seed and try to find all
            // possible points with same k
            Point seed = points[i];
            int same = 1; // record number of points with same x and y
            int sameX = 0; // record number of points which has same x (meaning the k does not exist)
            int most = 0;
            // key: k, value: number of points with same k
            Map<BigDecimal, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                if (seed.x == points[j].x && seed.y == points[j].y) {
                    same++;
                } else if (seed.x == points[j].x) {
                    sameX++;
                } else {
                    BigDecimal deltaY = new BigDecimal(points[j].y - seed.y);
                    BigDecimal deltaX = new BigDecimal(points[j].x - seed.x);
                    BigDecimal k = deltaY.divide(deltaX, 20, BigDecimal.ROUND_HALF_UP);
                    if (!map.containsKey(k)) {
                        map.put(k, 1);
                    } else {
                        map.put(k, map.get(k) + 1);
                    }
                    most = Math.max(most, map.get(k));
                }
            }
            most = Math.max(most, sameX) + same;
            res = Math.max(res, most);
        }
        return res;
    }

    public static void main(String[] args) {
        OnOneLine oneLine = new OnOneLine();
        Point[] points = new Point[4];
        for (int i = 0; i < 4; i++)
            points[i] = new Point(4, i);
        System.out.println(oneLine.maxPoints(points));
        //  int[][] sorted = oneLine.sortDualArray(new int[][] {{9,-25},{-4,1},{-1,5},{-7,7}});
        //for (int i = 0; i < 4;i++)
         //   System.out.println(Arrays.toString(sorted[i]));
    }
}
