package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1, "Swapnil", 25));
        list.add(new Employee(4, "Divya", 22));
        list.add(new Employee(6, "Vishal", 23));
        list.add(new Employee(2, "Vaishnavi", 24));

        // Collections.sort() can be used to sort in ascending order
        // if we have to compare any object which has different parameter then it is not possible by Collections.sort()
        // in these case Employee class implements Comparable interface
        // there we implements compareTo method
        Collections.sort(list);
        System.out.println(list);
    }
}
