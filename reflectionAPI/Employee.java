package reflectionAPI;

public class Employee
{
    private String name;
    private int id;
    private double salary;
    private int age;
    Employee(String name, int id, int age, double salary, int i)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.age = age;
    }
    public double getSalary()
    {
        return salary;
    }
    public int getAge()
    {
        return age;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}