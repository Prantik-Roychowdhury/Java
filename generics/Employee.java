package generics;

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
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    //Without using generics
//    @Override
//    public int compareTo(Object o) {
//        Employee e = (Employee) o;
//        return this.id-e.id;
//    }
    //Using Generics

    @Override
    public int compareTo(Employee o)
    {
        return this.id-o.id;
    }
}