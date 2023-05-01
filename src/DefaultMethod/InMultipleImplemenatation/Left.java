package DefaultMethod.InMultipleImplemenatation;

public interface Left {
    default void m1(){
        System.out.println("This is left interface");
    }
}
