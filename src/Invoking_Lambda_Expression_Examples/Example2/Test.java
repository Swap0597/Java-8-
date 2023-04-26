package Invoking_Lambda_Expression_Examples.Example2;

public class Test {
    public static void main(String[] args) {
        // normal implementation
        Interf i = new Interf_implemantation();
        i.sum(10, 20);
        i.sum(100, 200);

        // by lambda expression
        // no need to create new class which implements interf
        // Interf is data type for lambda expression
        Interf j = (a,b) -> System.out.println("Sum by Lambda Expression is :" + a + b);
        j.sum(10, 20);
        j.sum(100, 200);
    }
}
