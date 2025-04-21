package caseStudies.Study1;

import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter StudentID");
        int sttudentID = sc.nextInt();
        Student st = new Student(name, age,sttudentID);
        st.displayStudentDetails();
    }
}