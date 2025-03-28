package Interfaces;

public interface Vehicle
{
    static int speed = 10;
    void print();
    void start();
    static void utility()
    {
        System.out.println("Utility method");
    }

    public static void main(String[] args) {
        utility();
    }
    default void test()
    {
        System.out.println("This is a default method");
    }
}
