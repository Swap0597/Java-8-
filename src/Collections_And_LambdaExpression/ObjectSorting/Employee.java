package Collections_And_LambdaExpression.ObjectSorting;

public class Employee {
    private int eid;
    private String name;
    private int age;

    public Employee(int eid, String name, int age) {
        this.eid = eid;
        this.name = name;
        this.age = age;
    }

    public int getEid() {
        return eid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
