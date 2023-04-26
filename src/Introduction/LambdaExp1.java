package Introduction;

public class LambdaExp1 {
    // Method 1
    public void printHii(){
        System.out.println("hiii....");
    }

    // Method 2
    public void printSum(int a, int b){
        System.out.println(a + b);
    }

    // Method 3
    public int returnLength(String s){
        return s.length();
    }
    public static void main(String[] args) {

        // Method 1 can be written as () -> System.out.println("hiiii.....");
        // Method 2 can be written as (a, b) -> System.out.println(a+b);
        // Method 3 can be written as s -> s.length;

        // properties
        // 1. if body contains only one line then no need to write {}
        // 2. sometimes compiles can guess argument datatype then we do not have to write data type
        // 3. if single argument is present then no need to write ()
        // 4. if {} are not written then we can not use return keyword
    }
}
