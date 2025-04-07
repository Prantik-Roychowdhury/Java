package comparableAndComparatorInterface;

public class Person implements Comparable
{
    String name;
    int age;
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Object o)
    {
        Person p1 = (Person) o;
        return (int)(this.age - p1.age);
    }
}