class PalindromeString {

    public static void main(String[] args) {
        String z = "A man, a plan, a canal: Panama";
        String y = "0P";
        System.out.println(isPalindromeTwo(y));
        System.out.println(isPalindrome(z));
    }
    public static boolean isPalindrome(String s) {
        String a="",b="";
        for(int i=s.length()-1;i>=0;i--){
            if(! ( ((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90) || ( (int)s.charAt(i)>=97 && (int)s.charAt(i)<=112)) ){
                continue;
            }
            a=a+s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            if(! ( ((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90) || ( (int)s.charAt(i)>=97 && (int)s.charAt(i)<=112)) ){
                continue;
            }
            b=b+s.charAt(i);
        }
        if(a.equalsIgnoreCase(b)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isPalindromeTwo(String s) {
        String a="",b="";
        for(int i=s.length()-1;i>=0;i--){
            char temp=s.charAt(i);
            if(Character.isLetterOrDigit(temp)){
                a=a+temp;
            }
            else{
                continue;
            }
        }
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(Character.isLetterOrDigit(temp)){
                b=b+temp;
            }
            else{
                continue;
            }

        }
        return a.equalsIgnoreCase(b);
    }
}