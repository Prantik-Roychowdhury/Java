package taskOnInheritance;

public class Vehicle
{
    private String vehicleNumber;
    private String model;
    private double rentalPricePerDay;
    private boolean isAvailable;
    public Vehicle(String vehicleNumber, String model, double rentalPricePerDay)
    {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }
    public void displayDetails()
    {
        System.out.println("Vehicle Number: "+this.vehicleNumber+"\nModel: "+this.model+"\nRental Price per Day: "+this.rentalPricePerDay);
    }
    public void rentVehicle()
    {
        if(this.isAvailable)
            System.out.println("Can be rented");
        else
            System.out.println("Cannot be rented");
    }
}