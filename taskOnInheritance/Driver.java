package taskOnInheritance;

public class Driver
{
    public static void main(String[] args)
    {
        Car car = new Car("1234","BBB",120.0,4);
        Bike bike = new Bike("1654","HDR",50.0,true);
        System.out.println("Car:");
        car.displayDetails();
        System.out.println("\nBike: ");
        bike.displayDetails();
    }
}