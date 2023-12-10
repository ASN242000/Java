public class StaticBlock {

        static
        {
            System.out.println("b");
        }

        public static void main(String[] args)
        {
            System.out.println("c");

            System.out.println(Scalar.Scaler.i);
        }

}
