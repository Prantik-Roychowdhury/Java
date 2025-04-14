package generics.WildCard;

public class Driver
{
    public static void main(String[] args) {
        Student<Person>student = new Student<Person>(new Person(10,"ABC"));
        printDetails(student);
    }
    public static void printDetails(Student<? extends Person>student)
    {
        Person p = student.obj;
        System.out.println(p);
    }
}
