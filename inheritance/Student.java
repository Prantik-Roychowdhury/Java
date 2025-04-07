package inheritance;

public class Student extends Person
{
    private int studentId;

    public Student(String name, int age, int studentId)
    {
        super(name, age);
        this.studentId = studentId;
    }
    public void displayStudentDetails()
    {
        displayPersonDetails();
        System.out.println("Student ID: "+this.studentId);
    }
}