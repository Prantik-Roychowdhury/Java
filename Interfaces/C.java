package Interfaces;

public interface C extends A,B
{
    default void check()
    {
        System.out.println(A.a);
        A.message();
        print();
    }
    @Override
    default void print()
    {
        A.super.print();
    }

    public static void main(String[] args)
    {
        A.message();
//        C.check() //We cannot access a default method in a static context in interface

    }
}