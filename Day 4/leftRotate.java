import java.util.Arrays;

public class leftRotate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        rotateArrayByOne(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void rotateArrayByOne(int[] nums) {
        int n = nums.length;
        if(n == 1) return;
        int temp = nums[0];

        for(int i=1;i<n;i++){
            int t = nums[i];
            nums[i] = nums[i-1];
            nums[i-1] = t;
        }

        nums[nums.length - 1] = temp;
    }
}
