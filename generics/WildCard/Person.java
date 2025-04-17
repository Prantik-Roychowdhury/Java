package generics.WildCard;

public class Person
{
    private int id;
    private String name;
    Person(int id, String name)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
