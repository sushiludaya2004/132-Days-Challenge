import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, -1};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
