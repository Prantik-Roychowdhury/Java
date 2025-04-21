package caseStudies.Study2;

public class Employee
{
    private String name;
    private double salary;
    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    public void employeeInfo()
    {
        System.out.println("Name: "+name+"\nSalary: "+salary);
    }
}