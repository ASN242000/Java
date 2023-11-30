public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        boolean b[] = new boolean[5];
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        String s[] = new String[5];
        for (int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }

        int g[] = {1,2,3,4,5}; //Array initializer
        for (int i=0;i<g.length;i++){
            System.out.println(g[i]);
        }
    }
}
