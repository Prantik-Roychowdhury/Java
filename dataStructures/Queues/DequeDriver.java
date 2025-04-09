package dataStructures.Queues;

import java.util.Scanner;

public class DequeDriver
{
    static DoubleEndedQueue deq = new DoubleEndedQueue();
    static Scanner sc = new Scanner(System.in);
    public static void takeInput()
    {
        System.out.println("Press:\n1)For Insertion at Beginning\n2)For Insertion at End");
        switch (sc.nextInt())
        {
            case 1:
                System.out.println("Enter number of elements");
                int n = sc.nextInt();
                for(int i=0; i<n; i++)
                {
                    System.out.println("Enter data at position: "+(i+1));
                    int data = sc.nextInt();
                    deq.insertAtFront(data);
                }
                break;
            case 2:
                System.out.println("Enter number of elements");
                int len = sc.nextInt();
                for (int i=0; i<len; i++)
                {
                    System.out.println("Enter data at position: "+(i+1));
                    int data = sc.nextInt();
                    deq.insertAtEnd(data);
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    public static void deletion()
    {
        System.out.println("Press:\n1)For deletion at front\n2)For deletion at end");
        switch (sc.nextInt())
        {
            case 1:
                System.out.println("Deleted Element: "+deq.deleteAtFront());
                break;
            case 2:
                System.out.println("Deleted Element: "+deq.deleteAtEnd());
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
    public static void peek()
    {
        System.out.println("Press:\n1)To Peek at Front\n2)To Peek at End");
        switch (sc.nextInt())
        {
            case 1:
                System.out.println("Peeked element"+deq.getFront());
                break;
            case 2:
                System.out.println("Peeked element"+deq.getEnd());
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
    public static void Driver()
    {
        System.out.println("Press:\n1)For Insertion\t2)Deletion\n3)To Peek\t4)Display");
        switch (sc.nextInt())
        {
            case 1:
                takeInput();
                break;
            case 2:
                deletion();
                break;
            case 3:
                peek();
                break;
            case 4:
                deq.display();
        }
    }
    public static void driver()
    {
        int c;
        do {
            Driver();
            System.out.println("Press:\n1)To continue\n2)To Exit");
            c = sc.nextInt();
        }while (c==1);
    }
}