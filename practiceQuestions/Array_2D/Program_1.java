package practiceQuestions.Array_2D;

public class Program_1
{
    public static void isTranspose(int[][]a)
    {
        int[][]tr = AllPurposeClass.transpose(a);
        AllPurposeClass.printArray(tr);
    }
    public static void diagonal_sum(int[][]a)
    {
        System.out.println("Sum of the diagonals are: "+AllPurposeClass.sum_of_diagonals(a));
    }
    public static void main(String[] args)
    {
        int[][]a = AllPurposeClass.input();
//        AllPurposeClass.printArray(a);
//        diagonal_sum(a);
        isTranspose(a);
    }
}