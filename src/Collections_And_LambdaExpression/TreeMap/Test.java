package Collections_And_LambdaExpression.TreeMap;

import Collections_And_LambdaExpression.ArrayList.MyComparator;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        // if we pass nothing to constructor then by default ascending order sorting is done
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(5, "Swapnil");
        map.put(6, "Vaishnavi");
        map.put(21, "Vishal");
        map.put(3, "Divya");

        System.out.println("Without Comparator " + map);

        // passing comparator to constructor
        TreeMap<Integer, String> map2 = new TreeMap<>(new MyComparator());
        map2.put(5, "Swapnil");
        map2.put(6, "Vaishnavi");
        map2.put(21, "Vishal");
        map2.put(3, "Divya");

        System.out.println("Using Comparator " + map2);

        TreeMap<Integer, String> map3 = new TreeMap<>((a,b) -> b - a);
        map3.put(5, "Swapnil");
        map3.put(6, "Vaishnavi");
        map3.put(21, "Vishal");
        map3.put(3, "Divya");

        System.out.println("Lambda Expression " + map3);
    }
}
