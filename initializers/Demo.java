package initializers;

public class Demo
{
    static
    {
        System.out.println("2nd Multiline initializer");
    }
    static
    {
        System.out.println("1st Multiline initializer");
    }
    static
    {
        System.out.println("3rd Multiline Initializer");
    }
//    static
//    {
//        System.out.println("2nd Multiline initializer");
//    }
    public static void main(String[] args)
    {
        System.out.println("Main");
    }
}