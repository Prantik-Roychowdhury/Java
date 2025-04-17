package linkedList.doublyLinkedList;

import java.util.Scanner;

public class Driver
{
    static Scanner sc = new Scanner(System.in);
    static DoublyLL dll = new DoublyLL();
    public static void input()
    {
        System.out.println("Press:");
        System.out.println("1)For Insertion at Head\t2)For Insertion at End\n3)For Insertion at an Index\t4)Updation\n5)Deletion\t6)Display");
        switch (sc.nextInt())
        {
            case 1:
                System.out.println("Enter number of nodes");
                int n = sc.nextInt();
                int i = 0;
                while(i<n)
                {
                    System.out.println("Enter data at position: "+(i+1));
                    int data = sc.nextInt();
                    dll.insertAtHead(data);
                    i++;
                }
                dll.reverse();
                dll.display();
                break;
            case 2:
                System.out.println("Enter number of nodes");
                int n2 = sc.nextInt();
                int i2 = 0;
                while(i2<n2)
                {
                    System.out.println("Enter data at position: " + (i2 + 1));
                    int data = sc.nextInt();
                    dll.insertAtEnd(data);
                    i2++;
                }
                dll.display();
                break;
            case 3:
                System.out.println("Enter index");
                int index = sc.nextInt();
                System.out.println("Enter data");
                int data = sc.nextInt();
                System.out.println("Enter size");
                int size = sc.nextInt();
                dll.insertAtIndex(index,data,size);
                dll.display();
                break;
            case 4:
//                dll.updateNode(56);
                dll.displayReverse();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    public static void main(String[] args)
    {
        int choice;
        do {
            input();
            System.out.println("Press 1 to continue, anything else to stop execution");
            choice = sc.nextInt();
        }while (choice==1);
    }
}