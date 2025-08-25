public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        sort(arr);
        int num = -1;
        for(int i = 0; i<arr.length; i++){
            if(i != arr[i]){
                num = i;
                break;
            }
        }
        if(num == -1){
            num = arr.length;
        }
        System.out.println(num);
    }
    public static void sort(int[] nums){

        int i=0;
        while(i<nums.length){
            int index = nums[i];


            if(nums[i]<nums.length && nums[i] != nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }else{
                i++;
            }
        }
    }
}
