package DefaultMethod.InMultipleImplemenatation;

public interface Right {
    default void m1(){
        System.out.println("This is right interface");
    }
}
