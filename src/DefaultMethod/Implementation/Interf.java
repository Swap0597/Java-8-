package DefaultMethod.Implementation;

public interface Interf {
    default void method1(){
        System.out.println("This is default method");
    }
}
