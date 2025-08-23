public class removeDup {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,3,4};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }

//    static int removeDuplicates(int[] nums) {
//        int index = 0;
//        int n = nums.length;
//        int i;
//        for(i=0; i<n-1; i++){
//            if(nums[i] != nums[i+1]){
//                nums[index++] = nums[i];
//            }
//        }
//
//        if(i==n-1 && index == 0) return 1;
//
//        if(nums[i] != nums[i-1]){
//            nums[index++] = nums[i];
//        }
//        return index;
//    }

    static int removeDuplicates(int[] nums){
        int i=0;
        int index = 0;
        int n = nums.length;

        while(i < n){
            nums[index++] = nums[i];
            int j = i;
            while(j<n-1 && (nums[j] == nums[j+1])){
                j++;
            }
            i=j+1;
        }

        return index;

    }
}
