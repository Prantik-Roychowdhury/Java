package ExceptionHandling;

public class InitializingErrorDemonstration
{
    static String s1 = null;
    static String  s2 = s1.toUpperCase();
    public static void main(String[] args)
    {
        System.out.println(s1);
    }
}