package Static.wrtOverriding.Example2;

public class Test implements Interf {

    // writing same method in implementation class is not example of overriding
    // because static methods are not available to implementation class
    public static void m1(){
        System.out.println("Implementation class static method");
    }
    public static void main(String[] args) {
        m1();
        Interf.m1();
    }
}
