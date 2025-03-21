package staticAndNonStatic;

public class Demo2
{
    static Demo1 d1 = new Demo1();
    public Demo2()
    {
        System.out.println(Demo1.id);
        System.out.println(d1.name);
    }
    public static void main(String[] args)
    {
        new Demo2();
    }
}