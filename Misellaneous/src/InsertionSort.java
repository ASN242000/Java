public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {7,4,1,2,9,0,3,8};
        insertSort(a);
    }
    static void insertSort(int a[]){
        int j,key;

        for(int i=1;i<a.length;i++){
            key = a[i];
            j=i-1;
            while( j>=0 && a[j]>key){
                a[j+1] = a[j];
                j=j-1;
            }
            a[j+1] = key;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
