public class ThrowsDemo {
    static void ThrowsDemo() throws IllegalAccessException{
        System.out.println(("Inside throwOne"));
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try{
            ThrowsDemo();
        }catch(IllegalAccessException e){
            System.out.println("Caught: "+e);
        }
    }
}
