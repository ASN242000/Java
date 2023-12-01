public class Test {
    //Passing objects as parameters
    int a,b;
    Test(int i,int j){
        a=i;
        b=j;
    }
    boolean equalTo(Test o){
        if (o.a == a && o.b ==b)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Test t1 = new Test(100,500);
        Test t2 = new Test(100,500);
        Test t3 = new Test(200,400);
        System.out.println("T1 equals to T2 is "+ t1.equalTo(t2));
        System.out.println("T2 equals to T3 is "+ t2.equalTo(t3));
    }
}
