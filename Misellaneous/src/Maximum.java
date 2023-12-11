public class Maximum {
    public static void main(String[] args) {
        int arr[] ={3,4,1,5,6,3,56,3,234,6,76,23,545};
        System.out.println("Maximum: "+ max(arr));
    }
    public static int max(int a[]){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i])
                max=a[i];
        }
        return max;
    }
}
