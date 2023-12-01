public class WhileLoopFindingTheMidpoint {
     /* *
        The body of the while (or any other of Java’s loops) can be empty. This is
because a null statement (one that consists only of a semicolon) is syntactically
valid in Java.
         */
     public static void main(String[] args) {
         int i=100;
         int j=200;
         while(++i < --j);
         System.out.println("Midpoint is "+i);
     }
}
