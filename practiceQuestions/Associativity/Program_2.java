package practiceQuestions.Associativity;
//My Answer: -3
//Actual Answer: -3
public class Program_2
{
    public static void main(String[] args)
    {
        int a = 15;
        a /= a -= a += 5;
        System.out.println(a);
    }
}
