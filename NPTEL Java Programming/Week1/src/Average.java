import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Enter the total number of values to calculate the average");
        Scanner rd = new Scanner(System.in);
        int num = rd.nextInt();
        int a[] = new int[num];
        System.out.println("Enter the values to calculate the average");
        for(int i=0;i<a.length;i++){
            a[i] = rd.nextInt();
        }
        double sum=0, avg;
        for(int i=0;i<a.length;i++){
            sum += i;
        }
        avg= sum/num;
        System.out.println("The average is: "+avg);
    }
}
