package Static.Implementation;

public class Test implements Interf{
    // Main purpose of static method - to provide general utility function
    public static void main(String[] args) {
        // m1();     Mwthod 1 - Static method may be invoked on containing interface class only

        Test t = new Test();
        // t.m1();  Method 2 - Static method may be invoked on containing interface class only

        Interf.m1();   // Method 3
    }
}
