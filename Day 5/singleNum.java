public class singleNum {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }

    public static int singleNumber(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum ^= num;
        }
        return sum;
    }
}

