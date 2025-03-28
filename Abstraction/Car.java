package Abstraction;

public class Car extends Vehicle{
    @Override
    public void start()
    {
        System.out.println("Key-based");
    }

    @Override
    void stop() {
        System.out.println("Use breaks");
    }
}
