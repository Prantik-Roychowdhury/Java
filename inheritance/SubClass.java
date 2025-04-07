package inheritance;
//Examples of Variables shadowing
public class SubClass extends SuperClass
{
    double a=0.0;
    static double b = 321.1321;
    public void print()
    {
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(b);
        System.out.println(SuperClass.b);
    }
}