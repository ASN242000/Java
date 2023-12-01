public class NestedClasses {
    int x = 100;

    void test() {
        Inner in = new Inner();
        in.display();
    }

    class Inner {
        void display() {
            System.out.println("The value of x is " + x);
        }
    }

}
