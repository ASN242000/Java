import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        int n, a[];
        System.out.println("Enter the number of elements in array");
        n=rd.nextInt();
        a=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            a[i] = rd.nextInt();
        }
        int value;
        boolean found = false;
        System.out.println();
        System.out.print("Enter the element to be found ");
        value=rd.nextInt();
        for(int j=0;j<a.length;j++){
            if(a[j]==value)
            {
                System.out.println("Element "+value+" found at location "+(j+1));
                found = true;
                break;
            }
        }
        if(found==false)
            System.out.println("Element is not found in the array");
    }
}
