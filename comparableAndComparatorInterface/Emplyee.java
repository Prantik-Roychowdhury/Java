package comparableAndComparatorInterface;

public class Emplyee implements Comparable
{
    int id;
    String name;
    double salary;
    Emplyee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return id+" "+name+" "+salary;
    }
//    @Override
//    public int compareTo(Object o) {
//        Emplyee e = (Emplyee) o;
//        return (int)(this.salary - e.salary);
//    }

    @Override
    public int compareTo(Object o) {
        Emplyee e = (Emplyee) o;
        return (this.name.compareTo(e.name));
    }
}