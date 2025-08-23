public class arrraySortedRotated {
    public static void main(String[] args) {
//        int[] nums = {8, 8, 7, 6, 5};
//        int[] nums = {1,2,3,6,5};
        int[] nums = {2, 1, 3, 4};
        boolean ans = sortedRotated(nums);
        System.out.println(ans);
    }

    static boolean sortedRotated(int[] nums) {
        if(nums.length <= 1) return true;

        int i = 0;
        int n = nums.length;

        while(i<n-2){
            if(nums[i] > nums[i+1] && (nums[i+1] < nums[i+2] || nums[i+1] < nums[0])) ++i;
            else if(nums[i] < nums[i+1] || nums[i] == nums[i+1]) ++i;

            else return false;
        }

        return true;
    }
}
