package Static.wrtOverriding.Example1;

public class Test implements Interf {

    // writing method with same name in implementation class but non-static is not example of overriding
    // because static methods are not available to implementation class
    // both method are independent
    public void m1(){
        System.out.println("Implementation class static method");
    }
    public static void main(String[] args) {
        Interf.m1();
    }
}
