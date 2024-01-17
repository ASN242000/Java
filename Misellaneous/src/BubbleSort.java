public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {1,4,3,6,2};
        bubbleSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void bubbleSort(int a[]){
        int temp;
        boolean flag = false;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
            }
            if(flag == false)
                break;
        }
    }
}
