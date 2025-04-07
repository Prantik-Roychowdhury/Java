package linkedList;

import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        SinglyLL list = new SinglyLL();
        while (flag)
        {
            System.out.println("Enter 1 for inserting data\nPress 2 to exit");
            int c = sc.nextInt();
            switch (c)
            {
                case 1:
                    System.out.println("Enter the data");
                    int data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 2:
                    flag = false;
                    break;
            }
        }
        System.out.println("Your list");
        list.display();
    }
}