public class ReturningAObject {
    int a;
    ReturningAObject(int i){
        a = i;
    }
    ReturningAObject IncByTen(){
        ReturningAObject temp = new ReturningAObject(a+10);
        return temp;
    }

    public static void main(String[] args) {
        ReturningAObject o1 = new ReturningAObject(3);
        ReturningAObject o2;
        o2= o1.IncByTen();
        System.out.println("The value of returned object is "+o2.a);
    }
}
