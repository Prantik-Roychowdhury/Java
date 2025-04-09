package dataStructures.Stacks;

import java.util.Scanner;

public class Driver2
{
    static Scanner sc = new Scanner(System.in);
    static StackLL sll  = new StackLL();
    public static void takeInput()
    {
        System.out.println("Enter Stack Length");
        int n = sc.nextInt();
        for (int i=0; i<n; i++)
        {
            System.out.println("Enter element: "+(i+1));
            int data = sc.nextInt();
            sll.push(data);
        }
    }
    public static void Driver()
    {
        System.out.println("Enter choices: Press:\n1)Take Input\t2)Pop top element\n3)Peek Operation\t4)Display\n5)Display Reverse");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                takeInput();
                break;
            case 2:
                try
                {
                    System.out.println("Popped Element: "+sll.pop());
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
                try
                {
                    System.out.println("Top Element"+sll.peek());
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
                break;
            case 4:
                sll.display();
                break;
            case 5:
//                sll.reverse();
                sll.display();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    public static void main(String[] args) {
        int choice;
        do {
            Driver();
            System.out.println("Press 1 to continue and and anything else to exit.\nEnter choice");
            choice = sc.nextInt();
        } while (choice == 1);
    }
}