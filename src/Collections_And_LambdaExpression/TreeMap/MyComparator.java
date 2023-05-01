package Collections_And_LambdaExpression.TreeMap;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // method 1
        //return o2 - 01;

        // method 2
//        if (o1 > o2) {return -1;}
//        else if (o1 < o2) {return 1;}
//        else { return 0; }

        // Method 3
        return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0;
    }
}
