public class UsingBreakwithLabelAsAFormOfGoto {
    public static void main(String[] args) {
        boolean t=true;
        first:{
        second:{
            third:{
                System.out.println("This is before break");
                if(t) break second;
                System.out.println("This won't execute");
            }
            System.out.println("This won't execute");
        }
            System.out.println("This is the first label");
        }
    }
}
