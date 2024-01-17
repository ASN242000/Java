public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {3,2,5,1,6,8,4};
        insertionSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void insertionSort(int a[]){
        for(int i=1;i<a.length;i++){
            int j=i-1;
            int x = a[i];
            while(j>=0 && a[j]>x){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = x;
        }
    }

}
