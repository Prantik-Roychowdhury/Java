package Practice;

import java.util.Scanner;

public class InputDriver
{
    Object n1;
    Object n2;
    static Addition add = new Addition();
    static Subtraction sub = new Subtraction();
    static Multiplication mul = new Multiplication();
    static Division div = new Division();
    static Scanner sc = new Scanner(System.in);
    {
        try
        {
            System.out.println("Enter number 1");
            n1 = sc.nextDouble();
            System.out.println("Enter number 2");
            n2 = sc.nextDouble();
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Input error: " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Unexpected error: " + e);
        }
    }
    public void makeChoice()
    {
        System.out.println("Calculator App:\n1)Addition\t2)Subtraction\n3)Multiplication\t4)Division");
        switch (sc.nextInt())
        {
            case 1:
                System.out.println(add.calculate(n1,n2));
                break;
            case 2:
                System.out.println(sub.calculate(n1,n2));
                break;
            case 3:
                System.out.println(mul.calculate(n1,n2));
                break;
            case 4:
                System.out.println(div.calculate(n1,n2));
                break;
            default:
                throw new IllegalArgumentException("Invalid Choice");
        }
    }
}