public class consecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1};
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 1;
        int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                ++count;
                max = Math.max(max, count);
            }else{
                count = 0;
            }
        }

        return max;
    }
}
