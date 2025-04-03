package oops.Practice;

public class Truck extends AbstractVehicle
{
    Truck(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void start()
    {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop()
    {
        System.out.println("Truck is stopping");
    }

    @Override
    public void dislayTyoe()
    {
        System.out.println("Truck");
    }
}
