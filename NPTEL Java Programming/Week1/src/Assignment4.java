import java.util.Scanner;

//Armstrong number
public class Assignment4 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is Armstrong number or not");
        int num= rd.nextInt();
        int temp;
        temp=num;
        int digits=0;
        while(temp>0){
            temp = temp /10;
            digits++;
        }
        temp = num;
        int last,sum=0;
        while(temp>0){
            last = temp%10;
            sum += Math.pow(last,digits);
            temp = temp/10;
        }
        if(sum == num){
            System.out.println("The number "+num+" is an Armstrong number");
        }
        else{
            System.out.println("The number is not an Armstrong number");
        }
    }
}
