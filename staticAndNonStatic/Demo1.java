package staticAndNonStatic;
public class Demo1
{
    static int id = 10;
    String name = "Raj";
    public Demo1()
    {
        System.out.println(id);
        System.out.println(name);
    }
    public static void main(String[] args)
    {
        Demo1 d1 = new Demo1();
        System.out.println(d1.name);
    }
}