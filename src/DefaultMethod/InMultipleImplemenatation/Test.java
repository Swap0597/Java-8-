package DefaultMethod.InMultipleImplemenatation;

// in case of multiple inheritance if both parent interface has same method name then
    // we get compile time error as compiler will get confuse which interface to be called
// we have two solution for this
// 1. override the method
// 2. to call interface1 method write interf1.super.m1();
// 3. to call interface2 method write interf2.super.m1();
public class Test implements Left,Right{
    public void m1(){
        System.out.println("My own implementation");
        // or
        Left.super.m1();
        // or
        Right.super.m1();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
    }
}
