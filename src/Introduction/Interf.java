package Introduction;

@FunctionalInterface
public interface Interf {

    // Must contain only Single Abstract Method
    // if we have more than one abstract method then
    //      "Multiple non-overriding abstract methods found in interface" exception thrown
    // if no abstract method is found then "No target method found" is thrown
    public void m1();

    // Interface can have any no of default method
    default void play(){
        System.out.println("play");
    }

    // Interface can have any number of static method
    public static void playGames(){}
}
