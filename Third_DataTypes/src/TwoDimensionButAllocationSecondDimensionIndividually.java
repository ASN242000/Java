import java.util.Scanner;

public class TwoDimensionButAllocationSecondDimensionIndividually {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a[][] = new int[5][];
        for(int i=0;i<5;i++){
            a[i]=new int[i+1];
        }
        int k=1;
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k+ " ");
                k++;
            }
            System.out.println();
        }
    }
}
