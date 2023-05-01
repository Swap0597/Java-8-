package Collections_And_LambdaExpression.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(0);
        list.add(5);
        list.add(15);
        list.add(20);

        System.out.println("Before Sorting" + list);
        // Collections.sort(list);
        // System.out.println("After Sorting" + list);

        // Traditional Method - Create new class and implement Comparator interface
        // Collections.sort(list, new MyComparator());
        // System.out.println("After Sorting" + list);

        // using lambda expression
        Collections.sort(list, (a, b) -> b - a);
        System.out.println("Lambda Expression " + list);

    }
}
