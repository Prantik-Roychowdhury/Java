package caseStudies.Study2;

public class PartTimeEmployee extends  Employee
{
    private int workingHours;
    PartTimeEmployee(String name, double salary, int workingHours)
    {
        super(name, salary);
        this.workingHours = workingHours;
    }
    public void partTimeEmployeeInfo()
    {
        super.employeeInfo();
        System.out.println("Working Hours: "+workingHours);
    }
}