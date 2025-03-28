package Interfaces;

public interface A
{
    int a = 10;
    static void message()
    {
        System.out.println("This is interface A");
    }
    default void print()
    {
        System.out.println("Hey");
    }
}
