package inheritance;

public class ParentChildDriver
{
    //Members that get inherited from Parent Class to Child Class
    /*
        * Static Variables
        * Non-Static Variables
        * Non-Static Methods
        * Static Methods
    */
    //Members that get inherited from Parent Class to Child Class
    /*
        * Constructors
        * Private Members
        * Static and Non-Static initializers
        * */
    public static void main(String[] args)
    {
        //Loading Process with inheritance
    /*
        * If the child class has to loaded then both parent and child class has to be loaded into the memory
        * When the class is loaded into class static area the static initializers will also be loaded
        */
        //Constructor Chaining using super() <- statement
        /*
        * In any constructor, the compiler will add a no-argument super() call statement
        * If a super() call statement is explicitly provided by the programmer then the compiler won't provide a super() call statement
        * Compiler will not add a super() cll statement in the constructors that contains this() call statement
        * A constructor can contain either a super() call statement or this() call statement but not both
        * this() call or super() call statement is the first line written in a constructor, provided that the programmer write that statement
        * Even the parent class has a super() call constructor which calls the constructor of the Object class, the super-most class of all the other classes
        * Whichever class that does not participate in Inheritance, it will extend Object class by default
    */
        Child c = new Child();
    }
}