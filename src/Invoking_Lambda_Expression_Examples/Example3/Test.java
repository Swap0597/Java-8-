package Invoking_Lambda_Expression_Examples.Example3;

public class Test {
    public static void main(String[] args) {
        Interf i = new InterfImplementation();
        System.out.println("Square by Normal Implementation :" + i.square(2));
        System.out.println("Square by Normal Implementation :" + i.square(5));

        // by Lambda Expression
        Interf j = x -> x*x;
        System.out.println("Square by Lambda Expression :" + i.square(2));
        System.out.println("Square by Lambda Expression :" + i.square(5));
    }
}
