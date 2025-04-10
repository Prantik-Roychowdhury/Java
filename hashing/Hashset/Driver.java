package hashing.Hashset;

import java.util.Scanner;

public class Driver
{
    static Scanner sc = new Scanner(System.in);
    static Hashset hs = new Hashset();
    public static void input()
    {
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter Data");
            hs.createHashSet(sc.nextInt());
        }
    }
    public static void driver()
    {
        System.out.println("Press:\n1)For Adding Data\t2)For Deleting Data\n3)For Searching Data\t4)Display\n5)Iterator");
        switch (sc.nextInt())
        {
            case 1:
                input();
                break;
            case 2:
                try
                {
                    System.out.println("Enter data to be deleted");
                    int n = sc.nextInt();
                    hs.delete(n);
                }
                catch (Exception e)
                {
                    System.out.println("Runtime Exception");
                }
                break;
            case 3:
                System.out.println("Enter data to search");
                int target = sc.nextInt();
                hs.search(target);
                break;
            case 4:
                hs.displayAllElement();
                break;
            case 5:
                hs.printHasSet();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
    public static void Perform()
    {
        int choice;
        do {
            driver();
            System.out.println("Press 1 to continue and 0 to exit");
            choice = sc.nextInt();
        }while (choice==1);
    }
}