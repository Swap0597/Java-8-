package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1, "Swapnil", 25));
        list.add(new Employee(4, "Divya", 22));
        list.add(new Employee(4, "Vishal", 23));
        list.add(new Employee(1, "Vaishnavi", 24));


        Collections.sort(list, new MyComparator());
        System.out.println(list);
    }
}
