public class ReplaceS {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.replace('l','w'));
        System.out.println(s.replace("llo","ooo"));
        System.out.println(s.replace("llo","uuuuuu"));

        System.out.println(s.replaceFirst("l","L"));
        System.out.println(s.replaceAll("l","L"));
    }
}
