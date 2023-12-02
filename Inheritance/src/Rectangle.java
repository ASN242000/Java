public class Rectangle extends Figure{
    Rectangle(int a, int b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside area of rectangle");
        return dim1*dim2;
    }
}
