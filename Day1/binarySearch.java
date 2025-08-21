public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 9;

        int n = arr.length;
        int start = 0;
        int end = arr.length-1;
        boolean found = false;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                found = true;
                System.out.println("Found at index : " + mid);
                break;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        if(!found){
            System.out.println("Not found");
        }
    }
}
