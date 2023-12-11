public class PrimeNumberOptimized {
    public static void main(String[] args) {
        if(isPrime(5))
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
    }
    static boolean isPrime(int n){
        for(int i=2;i<n/i;i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
