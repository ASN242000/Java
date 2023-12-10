import java.util.Scanner;

public class Assignment3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int n=sc.nextInt();
            int sum=0;
            int r=0;
            int i=0;
            while(r<n){
                if(i%2 == 0){
                    if(i%3 == 0)
                        sum += i;
                    r++;
                }
                i++;
            }

            System.out.println(sum);
        }
}

