package ExceptionHandling;

public class Demo2
{
    public static void main(String[] args)
    {
       try
       {
           System.out.println(10/0);
       }
//        System.out.println("Error");
       catch(Exception e)
       {
           System.out.println("Math Error");
       }
    }
}