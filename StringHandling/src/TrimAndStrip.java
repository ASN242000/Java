public class TrimAndStrip {
    public static void main(String[] args) {
        String s = "     This   is good!   ";
        System.out.println(s.trim());
        System.out.println(s.strip());
        System.out.println(s.stripLeading());
        System.out.println(s.stripTrailing());
    }
}
