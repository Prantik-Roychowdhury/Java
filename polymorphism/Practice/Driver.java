package polymorphism.Practice;

public class Driver
{
    public static void details(Employee e)
    {
//        e.jobRole();
//        ((PartTimeEmployee)e).designation();
//        ((PartTimeEmployee)e).jobRole();
        if(e instanceof FullTimeEmployee)
            e.jobRole();
        else
        {
//            e.jobRole();
            ((PartTimeEmployee)e).jobRole();
            ((PartTimeEmployee)e).designation();
        }
    }
    public static void main(String[] args)
    {
//        Employee e = new FullTimeEmployee("Prantik",50000.0,5000);
//        e.employeeInfo();
//        ((FullTimeEmployee)e).jobRole();
//        System.out.println("--------------------------------------------------------");
//        Employee e2 = new PartTimeEmployee("Avishek",50000.0,40);
//        e2.employeeInfo();
        Employee e = new FullTimeEmployee("Prantik",50000.0,25000);
        details(e);
    }
}