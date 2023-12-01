public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box(2,3,4);
        Box myBox2 = new Box(1,3,2);
        double vol;

        /**
        myBox1.depth =10;
        myBox1.height=20;
        myBox1.width=15;

        myBox2.width=3;
        myBox2.depth=6;
        myBox2.height=9;

        */
        System.out.println("Volume: "+myBox1.volume());
        System.out.println("Volume: "+myBox2.volume());
    }
}
