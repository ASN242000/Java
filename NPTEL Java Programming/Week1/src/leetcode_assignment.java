public class leetcode_assignment {
    static int unique(int a[]){
        int i,j,result=0;
        for(i=0;i<a.length;i++){
            result=a[i];
            for(j=i+1;j<a.length;j++){
                if(a[i] == 0 || a[j] == 0)
                    continue;
                if(a[i]==a[j]){
                    a[i]=0;
                    a[j]=0;
                    result = 0;
                    break;
                }
            }
            if(result!=0 || i==a.length-1)
                return result;
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = {2,2,1};
        System.out.println("Unique number is "+unique(a));
    }
}
