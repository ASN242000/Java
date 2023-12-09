public class A3DArray {
    public static void main(String[] args) {
        int a[][][] = new int [3][4][5]; // 3- 2 dimensional arrays with 4 rows and 5 columns
        int i,j,k;
        for(i=0;i<4;i++)
            for(j=0;j<5;j++)
                for(k=0;k<5;k++)
                    a[i][j][k] = i*j*k;
        for(i=0;i<3;i++){
            for(j=0;j<4;j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }



    }
}
