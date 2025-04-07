package polymorphism.covariantReturnType;

public class Bike extends Vehicle
{
//    public Vehicle getObject()
//    {
//        return new Bike(); //The object is getting upcasted to Vehicle Object
//        //If the return type of the function is child object, then it will not throw an exception because it is getting upcasted into Vehicle type
//    }
    //Example of Covariant Return Type
    public Bike getObject()
    {
        return new Bike();
    }
}