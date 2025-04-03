package oops.Practice;

abstract public class AbstractVehicle implements Vehicle
{
    protected String name;
    protected int speed;
    AbstractVehicle(String name, int speed)
    {
        this.name = name;
        this.speed = speed;
    }
    public void displaydetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Speed: "+speed);
    }

    @Override
    public void acceleration(int increment)
    {

    }

    @Override
    public void brake(int decrement)
    {

    }

    @Override
    public void getCurrentSpeed()
    {

    }
}