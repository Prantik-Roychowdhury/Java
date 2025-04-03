package oops.Practice;

public class Bike extends AbstractVehicle
{
    Bike(String name, int speed)
    {
        super(name, speed);
    }

    @Override
    public void start()
    {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop()
    {
        System.out.println("Bike is stopping");
    }

    @Override
    public void dislayTyoe()
    {
        System.out.println("Bike");
    }
}
