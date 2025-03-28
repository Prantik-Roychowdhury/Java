package polymorphism.Practice;

public class FullTimeEmployee extends Employee
{
    private int bonus;

    public FullTimeEmployee(String name, double salary, int bonus)
    {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void employeeInfo()
    {
        super.employeeInfo();
        System.out.println("Bonus: "+bonus);
    }
    public void jobRole()
    {
        System.out.println("Developer");
    }
}