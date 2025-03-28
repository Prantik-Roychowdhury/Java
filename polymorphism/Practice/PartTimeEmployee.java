package polymorphism.Practice;

public class PartTimeEmployee extends Employee
{
    private int workingHours;
    public PartTimeEmployee(String name, double salary, int workingHours)
    {
        super(name, salary);
        this.workingHours = workingHours;
    }

    @Override
    public void employeeInfo() {
        super.employeeInfo();
        System.out.println("Working Hours: "+workingHours);
    }

    @Override
    public void jobRole()
    {
        System.out.println("Job role of the part time employees is Cloud Architect");
    }
    public void designation()
    {
        System.out.println("Associate");
    }
}