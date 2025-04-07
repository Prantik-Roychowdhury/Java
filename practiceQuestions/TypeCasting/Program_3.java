package practiceQuestions.TypeCasting;
//My Answer: 1000 10
//Actual Answer: 1000 10
/**/
public class Program_3
{
    public static void main(String[] args)
    {
        Integer a = 1000;  // Autoboxing
        int b = a;          // Unboxing
        double d = 10.5;
        Long l = (long) d;  // Explicit casting from double to long
        System.out.println(b + " " + l);
    }
}