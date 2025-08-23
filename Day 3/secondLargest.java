import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] nums = {8, 8, 7, 6, 5};
//        int[] nums = {1};
//        int[] nums = {10, 10, 10, 10, 10};
        int ans = secondLargestElement(nums);
        System.out.println(ans);
    }

    static int secondLargestElement(int[] nums) {

        if(nums.length < 2) return -1;

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {

            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num < firstMax) {
                secondMax = num;
            }
        }


        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
    }
}
