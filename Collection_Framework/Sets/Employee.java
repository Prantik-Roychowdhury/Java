package Collection_Framework.Sets;

public class Employee implements Comparable<Employee>
{
    String name;
    int salary;
    Employee(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(Employee o)
    {
        return o.salary-this.salary;
    }
}