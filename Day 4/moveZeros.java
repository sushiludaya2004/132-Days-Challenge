import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        int[] nums = {0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void moveZeroes(int[] nums) {
        int i=0;
        int n = nums.length;
        if(n == 0) return;
        int j;
        while(i < n-1){
            if(nums[i]==0){
                j=i+1;
                while(j<n && nums[j] == 0){
                    j++;
                }
                if(i<n && j<n) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            ++i;
        }
    }
}
