package Abstraction;

public class Driver
{
    public static void main(String[] args)
    {
//        Vehicle v = new Vehicle(); Throws error because Vehicle is abstract
        Vehicle v = new Bike();
        v.start();
        v.stop();
        Vehicle v2 = new Car();
        v2.start();
        v2.stop();
    }
}
