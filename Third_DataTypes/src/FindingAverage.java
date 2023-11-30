import java.util.Scanner;

public class FindingAverage {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        System.out.println("Enter the total number of values for finding average");
        int n=rd.nextInt();
        double a[] = new double[n];
        for (int i=0;i<a.length;i++){
            a[i] = rd.nextDouble();
        }
        double avg=0;
        for (int i=0;i<a.length;i++){
            avg = avg + a[i];
        }
        avg = avg/n;
        System.out.println("The avg is "+avg);
    }
}
