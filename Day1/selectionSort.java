import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, -1};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
