public class BreakAsGotoExample {
    public static void main(String[] args) {
        boolean t= true;
        outer:{
            for(int i=0;i<3;i++){
                System.out.println("Outer : "+(i+1));
                inner:{
                    for(int j=0;j<100;j++) {
                        System.out.print(j + " ");
                        if (j == 10)
                            break inner;
                    }
                }
                System.out.println();
            }
            System.out.println("Loops complete");
        }
    }
}
