public class FinallyDemo {
    static void ProcA(){
        try{
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        }finally {
            System.out.println("ProcA's finally");
        }
    }

    static void ProcB(){
        try{
            System.out.println("Inside ProcB");
            return;
        }finally{
            System.out.println("ProcB's finally");
        }
    }

    static void ProcC(){
        try{
            System.out.println("Inside ProcC");
        }finally{
            System.out.println("ProcCs finally");
        }
    }

    public static void main(String[] args) {
        try{
            ProcA();
        }catch(Exception e){
            System.out.println("Exception caught");
        }
        ProcB();
        ProcC();
    }

}
