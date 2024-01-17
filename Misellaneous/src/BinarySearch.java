import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner rd= new Scanner(System.in);
        int n, a[];
        System.out.println("Enter the number of elements of the array");
        n = rd.nextInt();
        a = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            a[i] = rd.nextInt();
        }
        int target;
        System.out.println("Enter the element to be searched");
        target = rd.nextInt();
        BinarySearch b = new BinarySearch();
        if(b.BSearch(a,target) == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at "+(b.BSearch(a,target)+1)+" position");
    }
    public int BSearch(int q[],int target){
        int low=0,high=q.length,mid;
        while(low<=high){
            mid = (low+high)/2;
            if(q[mid] == target){
                return mid;
            }
            if(q[mid]<target){
                low = mid+1;
            }
            if(q[mid]>target){
                high = mid-1;
            }
        }
        return -1;
    }
}
