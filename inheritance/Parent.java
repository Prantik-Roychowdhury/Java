package inheritance;

public class Parent
{
    static int a = 10;
    int b = 10;
    public Parent()
    {
        System.out.println("Constructor for Parent Class");
    }
    {
        System.out.println("Non-Static Initializer in Parent Class");
    }
    static
    {
        System.out.println("Static Initializer in Parent Class");
    }
    public static void print()
    {
        System.out.println("Static Print function in Parent class");
    }
    public void display()
    {
        System.out.println("Non-static Print function inside Parent Class");
    }
}