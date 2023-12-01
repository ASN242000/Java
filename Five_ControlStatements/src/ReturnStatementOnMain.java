public class ReturnStatementOnMain {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Before Return");
        if(t)
            return; // return to caller
        System.out.println("This won't execute");
    }
}
