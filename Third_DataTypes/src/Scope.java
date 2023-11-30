public class Scope {
    public static void main(String[] args) {
        int x;
        x=10;
        if(x==10){
            int y=5;
            System.out.println("X is "+x+" and y is "+y);
            x=y*2;
        }
        // y=1; Throws an error. Since the scope of y ended in if block
        System.out.println("X is "+x);
    }
}
