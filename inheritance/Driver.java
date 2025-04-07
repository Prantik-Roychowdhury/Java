package inheritance;

public class Driver
{
    public static void main(String[] args)
    {
        Car car = new Car("Tata","V8",1600);
        System.out.println(car.name+" "+car.engineType+" "+ car.hp);
    }
}