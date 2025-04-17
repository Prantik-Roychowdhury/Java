package Collection_Framework.Sets;

import java.util.TreeSet;

public class TREESET_DEMO
{
    public static void main(String[] args)
    {
        Employee emp = new Employee("ABC",1);
        TreeSet<Employee>ts = new TreeSet<Employee>();
        ts.add(new Employee("Rohit",50000));
        ts.add(new Employee("Naveen",30000));
        ts.add(new Employee("Prantik",10000));
        System.out.println(ts);
        System.out.println();
        System.out.println(ts.descendingSet());
    }
}