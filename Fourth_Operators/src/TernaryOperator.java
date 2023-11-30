public class TernaryOperator {
    public static void main(String[] args) {
        int k,i=10;
        k= (i<0) ? -i : +i;
        System.out.println("The value os k is "+k);

        i=-10;
        k= (i<0) ? +i : -i;
        System.out.println("The value of k is "+k);
    }
}
