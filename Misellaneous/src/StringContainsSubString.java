public class StringContainsSubString {
    public static boolean check(String main, String sub){
        return main.matches((".*")+sub+(".*"));
    }
    public static boolean check1(String main, String sub){
        return main.contains(sub);
    }
    public static boolean check2(String main, String sub){
       return main.indexOf(sub) != -1;
    }

    public static void main(String[] args) {
        String haystack,needle;
        haystack = "sadbutsad";
        needle = "sad";
        System.out.println(check(haystack,needle));
        System.out.println(check1(haystack,needle));
        System.out.println(check2(haystack,needle));
    }

}
