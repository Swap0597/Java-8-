package Collections_And_LambdaExpression.ObjectSorting;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(4, "Katrina", 34));
        list.add(new Employee(2, "Bipasha", 45));
        list.add(new Employee(8, "Deepika", 38));
        list.add(new Employee(1, "Anushka", 45));

        System.out.println("Before Sorting" + list);

        // sorting by implementing comparator
        // Collections.sort(list, new MyComparator());
        // System.out.println("Traditional Sorting" + list);

        // sorting by Lambda Expression
        Collections.sort(list, (a, b) -> b.getEid() - a.getEid());
        System.out.println("Lambda Expression " + list);
    }
}
