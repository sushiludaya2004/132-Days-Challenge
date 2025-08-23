public class arraySortedOrNot {
    public static void main(String[] args) {
//        int[] nums = {8, 8, 7, 6, 5};
        int[] nums = {1,2,3,6,5};
//        int[] nums = {10, 10, 10, 10, 10};
        boolean ans = sortedOrNot(nums);
        System.out.println(ans);
    }

    static boolean sortedOrNot(int[] nums) {
        if(nums.length <= 1) return true;
        int i = 0;
        int n = nums.length;

        while(i<n-1){
            if(nums[i] < nums[i+1] || nums[i] == nums[i+1]) ++i;
            else return false;
        }

        return true;
    }
}
