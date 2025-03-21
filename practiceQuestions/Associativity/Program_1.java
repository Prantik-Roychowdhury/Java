package practiceQuestions.Associativity;
//My Answer: 4
//Actual Answer: 4
public class Program_1
{
    public static void main(String[] args)
    {
        int a = 12, b = 4, c = 2;
        int result = a / b * c + a % b - c;
        System.out.println(result);
    }
}