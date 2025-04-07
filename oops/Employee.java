package oops;

public class Employee
{
    int id;
    String name;
    double salary;
    String companyName;
    public Employee(int id)
    {
        this.id = id;
    }
    public Employee(int id, String name)
    {
        this(id);
        this.name = name;
    }
    public Employee(int id, String name, double salary)
    {
        this(id,name);
        this.salary = salary;
    }
    public Employee(int id, String name, double salary, String companyName)
    {
        this(id,name,salary);
        this.companyName = companyName;
    }
    public void message()
    {
        System.out.println("Employee Details:\nID: "+id+"\nName: "+name+"\nSalary: "+salary+"\nCompany Name: "+companyName);
    }
}