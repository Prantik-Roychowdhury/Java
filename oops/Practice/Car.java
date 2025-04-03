package oops.Practice;

public class Car extends AbstractVehicle
{
    Car(String name, int speed)
    {
        super(name, speed);
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop()
    {
        System.out.println("Car is stopping");
    }

    @Override
    public void dislayTyoe()
    {
        System.out.println("Car");
    }
}
