package dataStructures.Stacks;

import java.util.Scanner;

public class Driver
{
    public static void takeInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stack Size");
        int n = sc.nextInt();
        Stack stack = new Stack(n);
        System.out.println("Enter stack elements");
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter "+(i+1)+" Position element");
            int data = sc.nextInt();
            stack.push(data);
        }
        stack.display();
    }
    public static void main(String[] args)
    {
        takeInput();
    }
}