package initializers;
//Non-static initializers
public class Demo1
{
    static
    {
        System.out.println("Static Block");
    }
    public Demo1()
    {
        System.out.println("Constructor");
    }
    {
        System.out.println("1st non static initializer");
    }
    public static void main(String[] args)
    {
        System.out.println("Main");
        Demo1 d = new Demo1();
    }
}