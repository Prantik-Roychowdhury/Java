package oops.Practice;

public class VehicleTest
{
    public static void main(String[] args)
    {
        Car c = new Car("Toyota",75);
        Bike b = new Bike("Hayabusa",123);
        Truck t = new Truck("Lorry",111);
        c.getCurrentSpeed();
    }
}