public class gcd {
    public static void main(String[] args) {
        int n1 = 123;
        int n2 = 234;
        System.out.println(euclideanAlgo(n1, n2));
    }

    //Euclidean algorithm
    static int euclideanAlgo(int n1, int n2) {
        // code here
        int a = n1;
        int b = n2;
        while(a > 0 && b > 0){
            if(a > b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        if(a == 0){
            return b;
        }
        return a;
    }
}







