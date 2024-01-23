public class StringBufferDelete {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("This is a written test!");
        System.out.println("The buffer is: "+s);
        s.delete(9,17);
        System.out.println("The buffer after delete is: "+s);
        s.deleteCharAt(14);
        System.out.println("The buffer after deleteAt is: "+s);
    }
}
