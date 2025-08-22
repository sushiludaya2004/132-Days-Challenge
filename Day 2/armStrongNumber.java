public class armStrongNumber {
    public static void main(String[] args) {
        int n = 123;
        boolean flag = armstrongNumber(n);
        System.out.println(flag);
    }

    static boolean armstrongNumber(int n) {
        // code here
        int temp = n;
        long sum = 0;
        while(n > 0){
            int rem = n%10;
            sum += rem * rem * rem;
            n /= 10;
        }

        return (sum == temp ? true : false);
    }
}
