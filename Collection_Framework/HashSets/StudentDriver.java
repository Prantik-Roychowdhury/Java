package Collection_Framework.HashSets;

import java.util.HashSet;

public class StudentDriver
{
    public static void main(String[] args)
    {
        HashSet<Student>set = new HashSet<>();
        set.add(new Student("Prantik",1));
        set.add(new Student("Aniket",1));
        set.add(new Student("Naveen",2));
        set.add(new Student("Rohit",3));
        set.add(new Student("ABC",4));
        System.out.println(set);
    }
}