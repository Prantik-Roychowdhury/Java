package inheritance;

public class Car extends Vehicle
{
    int hp;
    public Car(String name, String engineType, int hp)
    {
        super(name,engineType);
        this.hp = hp;
        System.out.println("Child");
    }
}