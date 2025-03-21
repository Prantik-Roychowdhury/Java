package oops;
public class Student
{
    int id;
    String name,college_name;
    double marks;
    public Student(int getId, String getName, String getCollegeName, double getMarks)
    {
        id = getId;
        name = getName;
        college_name = getCollegeName;
        marks = getMarks;
    }
    public void studying()
    {
        System.out.println("The Student "+id+" is studying");
        System.out.println("He has scored: "+marks);
        System.out.println("His name is: "+name);
    }
}