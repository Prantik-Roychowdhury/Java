package polymorphism.methodOverriding;

public class Diver
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.sound();
        Tiger t = new Tiger();
        t.sound();
    }
}