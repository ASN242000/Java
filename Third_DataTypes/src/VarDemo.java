public class VarDemo {
    public static void main(String[] args) {
        var avg = 10.0;
        System.out.println("The var datatype value is "+avg);

        int var=1;
        //Here var is nothing but a user identifier
        System.out.println("The value of var variable is "+var);
        var k = -var;
        System.out.println("The value of k is "+k);

        //var is also used to declare arrays
        var myArray = new int[10]; //Valid
        // var myArr[] = new int[5];  //Invalid
        // var[] g = new int[6]; //Invalid
        //It is important to emphasize that var can be used to declare a variable only
        //when that variable is initialized.
        //var counter; //Invalid

        /* *
        Only one variable can be declared at a time;
        a variable cannot use null as an initializer; and the variable being declared
        cannot be used by the initializer expression. Although you can declare an array
        type using var, you cannot use var with an array initializer. For example, this
        is valid:
        var myArray = new int[10]; // This is valid.

            but this is not:
            var myArray = { 1, 2, 3 }; // Wrong
         */

    }
}
