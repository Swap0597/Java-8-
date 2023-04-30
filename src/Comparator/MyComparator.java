package Comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int ans = o1.getId() - o2.getId();
        if(ans == 0){
            ans = o1.getName().compareTo(o2.getName());
        }
        return ans;
    }
}
