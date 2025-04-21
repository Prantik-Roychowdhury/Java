package caseStudies.Study2;

public class FullTimeEmployee extends Employee
{
    private int bonus;
    FullTimeEmployee(String name, double salary, int bonus)
    {
        super(name, salary);
        this.bonus = bonus;
    }
    public void fulltimeEmployeeInfo()
    {
        super.employeeInfo();
        System.out.println("Bonus: "+bonus);
    }
}
