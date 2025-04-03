package ExceptionHandling;

import java.util.Scanner;

public class Try
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
        }
        catch (Exception e)
        {
            System.out.println("Exception handled");
        }
        finally {
            System.out.println("Closing Scanner Class");
            sc.close();
        }
    }
}