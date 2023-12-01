public class AccessControlContinued {
    public static void main(String[] args) {
        AccessControl ob = new AccessControl();
        ob.a = 10;
        ob.b = 20;
        // ob.c = 30; throws an error
        System.out.println(ob.a);
        System.out.println(ob.b);
        ob.setc(100);
        System.out.println(ob.getc());
    }
}
