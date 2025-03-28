package Abstraction;

public class Bike extends Vehicle
{
    @Override
    public void start() {
        System.out.println("Button-based");
    }

    @Override
    void stop() {
        System.out.println("Automated command");
    }
}
