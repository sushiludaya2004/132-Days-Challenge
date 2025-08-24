public class missingNumber {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,6,7,8,9};
        int missingNum = missingNum(nums);
        System.out.println(missingNum);
    }
    static int missingNum(int[] nums) {
        int n = nums.length;
        int total =  (n*(n+1))/2;
        int arraySum = 0;
        for(int i=0; i<n; i++){
            arraySum += nums[i];
        }
        int rem = total - arraySum;

        return rem;
    }
}
