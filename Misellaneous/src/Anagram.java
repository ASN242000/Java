import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1= "cat", s2="tcz";
        if(isAnagram(s1,s2))
            System.out.println(""+s1+" and "+s2+" are anagram.");
        else
            System.out.println("Not Anagram");
    }
    public static boolean isAnagram(String str1, String str2){
        boolean status = true;
        if(str1.length() != str2.length())
            status = false;
        char s1[] = str1.toLowerCase().toCharArray();
        char s2[] = str2.toLowerCase().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        status = Arrays.equals(s1,s2);
        return status;
    }
}
