public class Palindrome {
    public static void main(String[] args) {
        int num = 12331;
        int copy=num;
        int count = 0;
        int numDigit = num;
        while(numDigit>0){
            numDigit=numDigit/10;
            count++;
        }
        int sum =0, factor,digit,temp,j=count-1;
        for(int i=1 ;i<=count; i++){
            while(j>=0){
                factor= (int) Math.pow(10,j);
                digit=copy%10;
                copy=copy/10;
                temp=digit*factor;
                sum=sum+temp;
                j--;
            }

        }
        if(num == sum){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
}
