package oops;

import java.util.Scanner;

public class StudentDriver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter College Name");
        String college = sc.nextLine();
        System.out.println("Enter marks");
        double marks = sc.nextDouble();
        Student st = new Student(id,name,college,marks);
        st.studying();
        System.out.println("Enter ID");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name");
        String name2 = sc.nextLine();
        System.out.println("Enter College Name");
        String college2 = sc.nextLine();
        System.out.println("Enter marks");
        double marks2 = sc.nextDouble();
        Student st2 = new Student(id2,name2,college2,marks2);
        st2.studying();
    }
}