public class Split {
    public static void main(String[] args) {
        String s[] = new String[100];
        String s1 = "This is new for everyone";
        s = s1.split(" ");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
