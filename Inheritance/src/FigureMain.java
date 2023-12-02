public class FigureMain {
    public static void main(String[] args) {
        Figure f = new Figure(3,4);
        Triangle t = new Triangle(1,2);
        Rectangle r = new Rectangle(4,5);

        Figure ref;
        ref=f;
        System.out.println(ref.area());

        ref = t;
        System.out.println(ref.area());

        ref= r;
        System.out.println(ref.area());
    }
}
