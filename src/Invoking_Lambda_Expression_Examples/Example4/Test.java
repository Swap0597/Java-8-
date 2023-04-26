package Invoking_Lambda_Expression_Examples.Example4;

public class Test {
    public static void main(String[] args) {
//        MyRunnable r = new MyRunnable();
//        Thread t = new Thread(r);
//        t.start();

        Runnable r = () -> {
            for(int i=0; i<10; i++){
                System.out.println("MyRunnable" + i);
            }
        };
        Thread t = new Thread(r);
        t.start();

        for(int i=0; i<10; i++){
            System.out.println("Main" + i);
        }
    }
}
