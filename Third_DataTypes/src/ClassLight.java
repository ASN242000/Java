public class ClassLight {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long distance;
        long seconds;
        int d = 764_947_836;
        int z = 745__746__726;

        System.out.println("The value of d is "+d);
        System.out.println("The value of z is "+z);

        lightSpeed = 186000;
        days=1000;
        seconds= days*24*60*60;

        distance = lightSpeed * seconds;

        System.out.print("In "+ days);
        System.out.print(" days lignt will travel about ");
        System.out.println(distance+" miles.");
    }
}
