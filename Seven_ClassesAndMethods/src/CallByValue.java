public class CallByValue {
    public static void main(String[] args) {
        int a=5, b=10;
        System.out.println("Before method call a = "+a+" and b = "+b);
        meth(a,b);
        System.out.println("After method call a = "+a+" and b = "+b); // No change in the value of a and b
    }
    static void meth(int a, int b){
        a= a+5;
        b= b*3;
    }
}
