public class StartsAndEndsWithS {
    public static void main(String[] args) {

        System.out.println("Foobar".startsWith("Foo"));
        System.out.println("Fobar".endsWith("bar"));

        System.out.println("Foobar".startsWith("bar",3));
    }
}
