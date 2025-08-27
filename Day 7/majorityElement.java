https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();

        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num, 0)+1);
        // }

        // for(int num : nums){
        //     if(map.get(num) > nums.length/2){
        //         return num;
        //     }
        // }

        // return -1;

        //Moore's voting algo
        int cnt = 0;
        int ele=-1;

        for(int i=0; i<nums.length; i++){
            if(cnt == 0){
                ele = nums[i];
                cnt++;
            }else if(nums[i] == ele){
                cnt++;
            }else{
                cnt--;
            }
        }
        cnt = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == ele){
                cnt++;
            }
        }

        if(cnt > nums.length/2){
            return ele;
        }
        return -1;
    }
}
