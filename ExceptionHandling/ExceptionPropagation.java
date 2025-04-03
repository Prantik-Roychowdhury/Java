package ExceptionHandling;

public class ExceptionPropagation
{
    public static void alpha()
    {
        System.out.println("Alpha method");
        beta();
    }
    public static void beta()
    {
        System.out.println("Beta method");
        gamma();
    }
    public static void gamma()
    {
        System.out.println("Gamma method");
        System.out.println(10/0);
    }

    public static void main(String[] args)
    {
        try
        {
            alpha();
        }
        catch (Exception e)
        {
         //   System.out.println("Math Error");
        }
        finally {
            System.out.println("Go back to pre-school");
        }
    }
}