package Interfaces;

public interface B
{
    double a = 30;
    default void print()
    {
        System.out.println("Hey");
    }
}

