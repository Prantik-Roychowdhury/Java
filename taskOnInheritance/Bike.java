package taskOnInheritance;

public class Bike extends Vehicle
{
    private boolean hasGear;

    public Bike(String vehicleNumber, String model, double rentalPricePerDay, boolean hasGear)
    {
        super(vehicleNumber, model, rentalPricePerDay);
        this.hasGear = hasGear;
    }

    public void displayDetails()
    {
        super.displayDetails();
        if(hasGear)
            System.out.println("Bike has gear");
        else
            System.out.println("Bike does not have gear");
    }
}