package practiceQuestions.TypeCasting;
//My Answer: Class B\nClass A
//Actual Answer: Class B\nClass B
/*
Even though you are downcasting to A, it doesn't change the runtime type of the object, which is still B.
Since print() is overridden in B, the JVM still calls B's version of print() due to dynamic method dispatch.
*/
public class Program_2
{
    public static void main(String[] args)
    {
        A obj = new B();
        ((B) obj).print();
        ((A) obj).print();
    }
}

class A {
    void print() {
        System.out.println("Class A");
    }
}

class B extends A {
    void print() {
        System.out.println("Class B");
    }
}
