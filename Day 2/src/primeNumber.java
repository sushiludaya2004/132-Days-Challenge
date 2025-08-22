import java.util.ArrayList;
import java.util.List;

public class primeNumber {
    public static void main(String[] args) {
//        int n = 57;
//        for(int i=1; i<100; i++) {
//            if(primeOrNot(i))
//                System.out.print(i + " ");
//        }

        int start = 1;
        int end = 36;
        List<Integer> primeList = primeRange(start, end);
        if(!primeList.isEmpty()){
            System.out.println(primeList);
        }
    }

    static boolean primeOrNot(int num){

        if(num <= 1){
            return false;
        }

        if(num == 2) return true;

        if(num % 2 == 0){
            return false;
        }

        for(int i = 3; i*i <= num; i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    static List<Integer> primeRange(int start, int end){
        List<Integer> list = new ArrayList<>();

        for(int i = start; i<=end; i++){
            if(primeOrNot(i)){
                list.add(i);
            }
        }
        return list;
    }
}
