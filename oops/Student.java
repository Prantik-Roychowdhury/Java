package oops;
public class Student
{
    int id;
    String name,college_name;
    double marks;
    public Student(int id)
    {
        this.id = id;
    }
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public Student(int id, String name, String college_name)
    {
        this.id = id;
        this.name = name;
        this.college_name = college_name;
    }
    public Student(int id, String name, String college_name, double marks)
    {
        this.id = id;
        this.name = name;
        this.college_name = college_name;
        this.marks = marks;
    }
        public void studying()
    {
        System.out.println("The Student "+id+" is studying");
        System.out.println("He has scored: "+marks);
        System.out.println("His name is: "+name);
    }
}