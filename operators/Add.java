package operators;

import java.util.Scanner;

public class Add
{
    public static void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public static void driver()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        add(a,b);
    }
    public static void main(String[] args)
    {
        driver();
    }
}