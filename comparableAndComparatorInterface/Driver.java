package comparableAndComparatorInterface;

public class Driver
{
    public static void main(String[] args)
    {
        Emplyee e = new Emplyee(1,"A",10000.0);
        Emplyee e2 = new Emplyee(2,"B",20000.0);
//        if(e.compareTo(e2)>0)
//            System.out.println("e is greater");
//        else if(e.compareTo(e2)<0)
//            System.out.println("e2 is greater");
//        else
//            System.out.println("e and e2 are equal");
        if(e.compareTo(e2)>0)
            System.out.println("e is greater");
        else if(e.compareTo(e2)<0)
            System.out.println("e2 is greater");
        else
            System.out.println("e and e2 are equal");
    }
}