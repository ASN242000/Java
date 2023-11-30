import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int i,j,k=0;
        Scanner rd=new Scanner(System.in);
        int TwoD[][]=new int[4][5];
        for (i=0;i<4;i++)
            for(j=0;j<5;j++)
            {
                TwoD[i][j] =k;
                k++;
            }
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                System.out.print(TwoD[i][j]+" ");
            }
            System.out.println();
        }

    }
}
