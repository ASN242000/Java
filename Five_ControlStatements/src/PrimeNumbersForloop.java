public class PrimeNumbersForloop {
    public static void main(String[] args) {
        int n = 13;
        boolean isPrime;
        if(n<2)
            isPrime = false;
        else
            isPrime = true;
        for(int i=2; i<n/i ;i++){
            if((n%i) == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");

    }
}
