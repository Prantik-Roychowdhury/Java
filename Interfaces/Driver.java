package Interfaces;

public class Driver
{
    public static void main(String[] args)
    {
        Vehicle v = new Bike();
        v.print();
        v.start();
    }
}