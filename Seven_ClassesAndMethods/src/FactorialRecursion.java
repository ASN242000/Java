public class FactorialRecursion {
    int fact(int n){
        int result;
        if(n==1)
            return 1;
        else {
            result = fact(n-1)*n;
            return result;
        }
    }

    public static void main(String[] args) {
        FactorialRecursion ob = new FactorialRecursion();
        System.out.println("Factorial of 5 is "+ ob.fact(5));
    }
}
