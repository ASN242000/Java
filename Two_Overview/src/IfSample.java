public class IfSample {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        if(x<y)
            System.out.println("X is less then Y");
        x=x*2;
        if(x==y)
            System.out.println("X is equal to Y");

        x=x*2;
        if(x>y)
            System.out.println("X is greater than Y");
        if(x==y)
            System.out.println("X is equal to Y");
    }
}
