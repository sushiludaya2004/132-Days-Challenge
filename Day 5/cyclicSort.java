import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    //works only for range [1,n]
    public static void sort(int[] arr){
        int i=0;

        while(i<arr.length){
            int index = arr[i] - 1;
            if(arr[i] != arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }else{
                i++;
            }
        }
    }
}
