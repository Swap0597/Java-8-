package Invoking_Lambda_Expression_Examples.Example1;

public class Test {
    public static void main(String[] args) {
        // normal method
        Interf i = new Interf_Implementation();
        i.m1();

        // calling with help of lambda expression
        // here implementing interface is not needed as it is written in lambda expression directly
        // Interf is data type for lambda expression
        Interf j = () -> System.out.println("Calling by Lambda Expression");
        j.m1();
    }
}
