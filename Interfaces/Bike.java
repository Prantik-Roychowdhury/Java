package Interfaces;

public class Bike implements Vehicle
{
    @Override
    public void print() {
        System.out.println(speed);
        System.out.println("Hello World");
    }

    @Override
    public void start() {
        System.out.println("Bike is starting");
        test();
    }
}
