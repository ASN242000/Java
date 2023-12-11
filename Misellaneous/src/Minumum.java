public class Minumum {
    public static void main(String[] args) {
        int arr[] ={3,4,1,5,6,3,56,3,234,6,76,23,545};
        System.out.println("Maximum: "+ min(arr));
    }
    static int min(int a[]){
        int min = a[0];
        for(int i=1;i<a.length;i++){
            if (min>a[i])
                min = a[i];
        }
        return min;
    }
}
