package Collections_And_LambdaExpression.TreeSet;

import Collections_And_LambdaExpression.ArrayList.MyComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        // if nothing is passed to constructor then by default ascending order sorting is done
        TreeSet<Integer> list = new TreeSet<>();
        list.add(10);
        list.add(0);
        list.add(5);
        list.add(15);
        list.add(20);

        System.out.println("Before Sorting" + list);

        // Tradition way
        // TreeSet<Integer> list2 = new TreeSet<>(new MyComparator());

        // Lambda Expression
        TreeSet<Integer> list2 = new TreeSet<>((a,b) -> b - a);
        list2.add(10);
        list2.add(0);
        list2.add(5);
        list2.add(15);
        list2.add(20);

        System.out.println("Lambda Expression Sorting" + list2);

    }
}
