package linkedList.circularLinkedList;

import java.util.Scanner;

public class Driver
{
    static CircularLL cll = new CircularLL();
    static Scanner sc = new Scanner(System.in);
    public static void input()
    {
        System.out.println("Press:\n1)Insertion At Head\t2)Insertion At End\n3)Insertion At Index\t4)Updation\n5)Deletion\t6)Display");
        switch (sc.nextInt())
        {
            case 1:
                System.out.println("Enter number of nodes");
                int n = sc.nextInt();
                int i = 0;
                while (i<n)
                {
                    System.out.println("Enter data for Position: "+(i+1));
                    int data = sc.nextInt();
                    cll.insertAtBeginning(data);
                    i++;
                }
                cll.printList();
                break;
            case 2:
                System.out.println("Enter number of nodes");
                int n2 = sc.nextInt();
                int i2 = 0;
                while (i2<n2)
                {
                    System.out.println("Enter data for Position: "+(i2+1));
                    int data = sc.nextInt();
                    cll.insertAtEnd(data);
                    i2++;
                }
                cll.printList();
                break;
            case 3:
                System.out.println("Enter index");
                int index = sc.nextInt();
                System.out.println("Enter data");
                int data = sc.nextInt();
                cll.insertAtPosition(index,data);
                cll.printList();
                break;
            case 4:
                System.out.println("Enter index");
                int ind = sc.nextInt();
                System.out.println("Enter data");
                int newValue = sc.nextInt();
                cll.update(ind,newValue);
                cll.printList();
                break;
            case 5:
                System.out.println("Enter index");
                int in = sc.nextInt();
                cll.deletion(in);
                cll.printList();
                break;
            case 6:
                cll.printList();
        }
    }
    public static void main(String[] args)
    {
        int choice;
        do {
            input();
            System.out.println("\nPress 1 to continue, 2 to exit");
            choice = sc.nextInt();
        }while (choice==1);
    }
}