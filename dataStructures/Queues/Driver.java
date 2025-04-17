package dataStructures.Queues;

import java.util.Scanner;

public class Driver
{
    static Scanner sc = new Scanner(System.in);
    static QueueLL qll = new QueueLL();
    public static void takeInput()
    {
        System.out.println("Enter Queue Size");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter data for position: "+(i+1));
            int data = sc.nextInt();
            qll.enqueue(data);
        }
    }
    public static void driver()
    {
        System.out.println("Press:\n1)For Enqueue\t2)For Dequeue\n3)Peek\t4)Display\n5)Get Size");
        switch (sc.nextInt())
        {
            case 1:
                takeInput();
                break;
            case 2:
                try {
                    System.out.println("Popped Element: "+qll.dequeue());
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
                try {
                    System.out.println("Peeked Element: "+qll.peek());
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
                break;
            case 4:
                qll.display();
                break;
            case 5:
                System.out.println("Size: "+qll.getSize());
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
    public static void main(String[] args)
    {
        int c;
        do {
            driver();
            System.out.println("Press 1 to continue 0 to end");
            c = sc.nextInt();
        }while (c == 1);
    }
}