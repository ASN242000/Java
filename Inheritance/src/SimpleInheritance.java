public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i =10;
        superOb.j = 20;
        System.out.println("Contents of super object is ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 2;
        subOb.k = 3;

        System.out.println("Contents of subclass is ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Sum of i,j and k are ");
        subOb.sum();
    }
}
