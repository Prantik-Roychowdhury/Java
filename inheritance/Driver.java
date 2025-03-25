package inheritance;

public class Driver
{
    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bike bike = new Bike();
        vehicle.display();
        System.out.println(bike.name);
    }
}