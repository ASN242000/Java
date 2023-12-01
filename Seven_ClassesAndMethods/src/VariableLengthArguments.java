public class VariableLengthArguments {
    static void va(int ... v){
        System.out.println("The length of args is "+v.length);
        for(int i : v)
            System.out.print(i +" ");
        System.out.println();
    }

    public static void main(String[] args) {
        va(10);
        va(10,20,30);
        va(3,4,5,6,7,8);
    }
}
