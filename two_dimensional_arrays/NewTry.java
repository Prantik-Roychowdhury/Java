package two_dimensional_arrays;

public class NewTry
{
    public static void findGreatest()
    {
        int[][]a = Array_2D.input();
        int greatest = 0;
        for(int i=0; i<a.length;i++)
        {
            for(int j=0; j<a[i].length;j++)
            {
                if (greatest<a[i][j])
                    greatest = a[i][j];
            }
        }
        System.out.println("Greatest Element: "+greatest);
        System.out.println("The array is:");
        Array_2D.printInSingleLine(a);
    }
    public static void main(String[] args)
    {
        findGreatest();
    }
}