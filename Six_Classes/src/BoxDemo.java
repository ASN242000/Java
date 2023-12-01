public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;
        myBox.width = 10;
        myBox.height = 15;
        myBox.depth = 20;

        vol = myBox.depth * myBox.height * myBox.width;
        System.out.println("Volume : "+vol);
    }
}
