package Collection_Framework.List;

public class Employee implements Comparable<Employee>
{
    String name;
    int id;
    Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employee o)
    {
        return (this.id-o.id);
    }
}