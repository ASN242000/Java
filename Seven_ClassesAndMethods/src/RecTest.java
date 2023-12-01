import java.util.Scanner;

public class RecTest {
    int values[];
    RecTest(int i){
        values = new int[i];
    }
    void printArray(int i){
        if (i==0)
            return;
        else{
            printArray(i-1);
            System.out.println("["+(i-1)+"]" + values[i-1]);
        }
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        RecTest a = new RecTest(10);
        for(int i=0;i<10;i++)
            a.values[i] = i;
        a.printArray(10);
    }
}
