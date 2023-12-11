public class Fibonacii {
    public static void main(String[] args) {
        fibonacci(10);
    }
    static void fibonacci(int n){
        int f1=0,f2=1,f3;
        if (n==1)
            System.out.println(f1);
        else{
            System.out.print(f1+" "+f2);
            for(int i=3;i<=n;i++){
                f3=f1+f2;
                System.out.print(" "+f3);
                f1=f2;
                f2=f3;
            }
        }
    }
}
