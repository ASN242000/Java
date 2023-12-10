import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        double x,y,z;
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter three numbers");
        x=rd.nextDouble();
        y=rd.nextDouble();
        z=rd.nextDouble();

        if(x>=y && x>=z)
            System.out.println("The value "+x+"is the greatest.");
        else if (y>=x && y>=z)
            System.out.println("The value "+y+"is the greatest.");
        else
            System.out.println("The value "+z+" is the greatest.");
    }
}
