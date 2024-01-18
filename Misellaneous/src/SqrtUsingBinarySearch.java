public class SqrtUsingBinarySearch {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int high=x,low=1,mid;
        while(low<=high){
            mid = (low+high)/2;
            if(mid*mid == x)
                return mid;
            else if ((mid*mid)>x){
                high = mid-1;
            }
            else
                low = mid +1;
        }
        return Math.round(high);
    }
}
