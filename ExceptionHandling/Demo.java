package ExceptionHandling;
//RTS is a software that controls all of the runtime systems
public class Demo
{
    public static void main(String[] args)
    {
//        System.out.println(10/0);  -> Throws an error because of the faulty input provided
        try
        {
            System.out.println(10/0);
        }
        catch (Exception e) //It is an object which is created due to faulty input or faulty logic which will lead to a runtime error and abrupt termination of the program if it is not handled
        {
            System.out.println("Math Error, division by zero is undefined");
        }
    }
}
