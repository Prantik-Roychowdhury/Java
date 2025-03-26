package taskOnInheritance;

public class Car extends Vehicle
{
    private int numberOfDoors;
    public Car(String vehicleNumber, String model, double rentalPricePerDay, int numberOfDoors)
    {
        super(vehicleNumber, model, rentalPricePerDay);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Car has: "+numberOfDoors+" doors");
    }
}
