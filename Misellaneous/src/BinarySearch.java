public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {2,5,7,8,9};
        binarySearch(a, 9);
    }
    static void binarySearch(int a[],int target){
        int low=0, high=a.length-1, mid;
        mid=(low+high)/2;
        while(low<=high){
            if(target == a[mid])
            {
                System.out.println("Element found at location "+mid);
                break;
            }
            else if(target<a[mid])
                high=mid-1;
            else
                low=mid+1;
            mid=(low+high)/2;
        }
        if(low>high)
            System.out.println("Element not found");
    }

}
