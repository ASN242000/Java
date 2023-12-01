public class PassByReference {
    int x,y;
    PassByReference(int a, int b){
        x=a;
        y=b;
    }
    void meth(PassByReference o){
        o.x = o.x+5;
        o.y = o.y*5;
    }
    public static void main(String[] args) {
        PassByReference a = new PassByReference(3,4);
        System.out.println("Before method call a = "+a.x+" and b = "+a.y);
        a.meth(a);
        System.out.println("After method call a = "+a.x+" and b = "+a.y);

    }
}
