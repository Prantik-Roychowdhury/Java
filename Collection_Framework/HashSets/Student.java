package Collection_Framework.HashSets;

import java.util.Objects;

public class Student
{
    String name;
    int id;
    Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, id);
    }
}