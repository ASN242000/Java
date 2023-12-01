public class Box {
    //Overloading Constructors
    double width,height,depth;
    Box(){
        width =-1;
        height=-1;
        depth =-1;
    }
    Box(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    Box(double length){
        width= height= depth = length;
    }
    void volume(){
        System.out.println("Volume: "+(width*height*depth));
    }
    public static void main(String[] args) {
        Box b = new Box();
        Box b1 = new Box(2,3,4);
        Box b2 = new Box(4);
        b.volume();
        b1.volume();
        b2.volume();
    }

}
