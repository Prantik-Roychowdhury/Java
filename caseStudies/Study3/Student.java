package caseStudies.Study3;

public class Student extends Person
{
    private int studentID;
    Student(String name, int age, int studentID)
    {
        super(name, age);
        this.studentID = studentID;
    }
    public void displayStudentInfo()
    {
        super.displayInfo();
        System.out.println("StudentID: "+studentID);
    }
}