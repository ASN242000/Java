public class ReverseString {
    public static void stringReversal(String s){
        for(int i=s.length()-1;i>=0;i--)
            System.out.print(s.charAt(i));
        System.out.println();
    }

    public static void main(String[] args) {
        String s="Anusha";
        stringReversal(s);
    }
}
