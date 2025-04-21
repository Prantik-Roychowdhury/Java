package caseStudies.Study1;

public class Student extends Person
{
    private int studentID;
    Student(String name, int age, int studentID)
    {
        super(name, age);
        this.studentID = studentID;
    }
    public void displayStudentDetails()
    {
        super.displayDetails();
        System.out.println("Student ID: "+studentID);
    }
}