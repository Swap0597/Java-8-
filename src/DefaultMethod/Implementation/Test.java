package DefaultMethod.Implementation;

public class Test implements Interf{

    // Default method are available after 1.7 version i.e, from 1.8 version
    // we can declare any number of default method in interface
    // these methods are called defender method or virtual extension methods
    // these methods are available to by default all implementation classes
    // and implementation can directly use it or override it
    // we can not override object class method as default method inside interface otherwise we get compile time error

    public void method1(){
        System.out.println("This is overriding method");
    }
    public static void main(String[] args) {
         Test t = new Test();
         t.method1();
    }
}
