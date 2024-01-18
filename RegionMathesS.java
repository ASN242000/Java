public class RegionMathesS {
    public static void main(String[] args) {
        String s1="This is good";
        String s2 = "good";
        String s3 = "Good";

        System.out.println(s1.regionMatches(8,s2,0,4));

        System.out.println(s1.regionMatches(true,8,s2,0,4));
    }
}
