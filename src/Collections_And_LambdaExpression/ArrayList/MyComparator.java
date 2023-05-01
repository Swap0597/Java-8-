package Collections_And_LambdaExpression.ArrayList;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // Method 1
//        if(o1 > o2){ return -1; }
//        else if(o1 < o2){ return 1; }
//        else return 0;

        // Method 2
//        return (o1 > 02) ? -1 : (o1 < o2) ? 1 : 0;

        // Method 3
        return o2 - o1;

    }
}
