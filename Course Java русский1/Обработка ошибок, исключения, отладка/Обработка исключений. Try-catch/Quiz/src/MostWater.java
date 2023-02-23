public class MostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            if ((right - left)*Math.min(height[right],height[left]) >= max) {
                max = (right- left)*Math.min(height[right],height[left]) ;
            }
            if (height[left] < height[right])
                left++;
            else right--;
        }
        return max;
    }

    public static void main(String[] args) {
        MostWater mostWater = new MostWater();
        System.out.println(mostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(mostWater.maxArea(new int[]{1,1}));
        System.out.println(mostWater.maxArea(new int[]{2,3,4,5,18,17,6}));
    }
}
