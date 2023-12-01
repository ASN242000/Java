public class OverloadDemo {
    void test(){
        System.out.println("No Parameters");
    }
    void test(int a, int b){
        System.out.println("A is "+a+" and B is "+b);
    }
    void test (double a){
        System.out.println("Double value of a is "+a);
    }

    public static void main(String[] args) {
        OverloadDemo d = new OverloadDemo();
        d.test();
        d.test(2.3);
        d.test(3,4);
        d.test(4); //Automatic type conversions apply to method overloading
    }
}
