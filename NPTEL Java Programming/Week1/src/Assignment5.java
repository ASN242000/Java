import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int n = rd.nextInt();
        double marks[] = new double[n];
        for(int i=0;i<marks.length;i++){
            marks[i] = rd.nextDouble();
        }
        double max, avg,sum=0;
        max=marks[0];
        for(int i=1;i<marks.length;i++)
            if(max<marks[i])
                max=marks[i];
        for(int i=0;i< marks.length;i++){
            sum += marks[i];
        }
        avg = sum/n;
        System.out.println("Max marks secured is "+max);
        System.out.println("Average: "+avg);
    }
}
