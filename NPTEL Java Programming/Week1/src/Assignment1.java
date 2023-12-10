import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        double r, area, perimeter;
        System.out.println("Enter the radius of the circle");
        Scanner rd = new Scanner(System.in);
        r = rd.nextDouble();

        if (r<=0){
            System.out.println("Please Enter non zero positive number");
        }
        else{
            area = Math.PI *r *r;
            perimeter = 2 * Math.PI * r;
            System.out.println("Area: "+area);
            System.out.println("Perimeter: "+perimeter );
        }
    }
}
