package practiceQuestions.TypeCasting;
//My Answer: Compilation error
//Actual Answer: -128\n7
/*
* Byte 127 + 1 = -128
* += operator implicitly type casts even if it is a downcaste, like here, it downcasted double to int
*/
public class Program_1
{
    public static void main(String[] args)
    {
        byte b = 127;
        b = (byte) (b + 1);
        int x = 5;
        double y = 2.5;
        x += y;
        System.out.println(b);
        System.out.println(x);
    }
}