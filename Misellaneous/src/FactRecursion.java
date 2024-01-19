import java.util.Scanner;

public class FactRecursion {
    public static void main(String[] args) {
        Scanner rd= new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = rd.nextInt();
        System.out.println("The factorial of number "+n+" is "+fact(n));
    }
    public static int fact(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
