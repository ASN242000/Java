public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {2,4,56,8,5,34,56};
        int target = 8;
        if(linearSearch(a,target) == -1)
            System.out.println("Element not found");
        else {
            System.out.println("Element found at location "+linearSearch(a,target));
        }
    }
    static int linearSearch(int a[], int target){
        for(int i=0;i<a.length;i++){
            if(a[i] == target)
                return i+1;
        }
        return -1;
    }
}
