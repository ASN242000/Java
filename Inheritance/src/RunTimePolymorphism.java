public class RunTimePolymorphism {
    public static void main(String[] args) {
        DynamicMethodDispatch a = new DynamicMethodDispatch();
        DMD b = new DMD();
        DMDN c = new DMDN();

        DynamicMethodDispatch r;
        r=a;
        r.callme();

        r=b;
        r.callme();

        r=c;
        r.callme();
    }
}
