public class EqualsS {
    public static void main(String[] args) {
        String s1 ="Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String ("Art");
        String s4 = new String(s3);

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
