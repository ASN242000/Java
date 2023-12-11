public class FactorialIteration {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n){
        int product=1;
        if(n==0 || n==1)
            return 1;
        else {
            for(int i=1;i<=n;i++){
                product *= i;
            }
        }
        return product;
    }
}
