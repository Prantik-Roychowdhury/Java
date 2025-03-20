package two_dimensional_arrays;

public class MyClass
{
    public static void findGreatest(int[][]a)
    {
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
    }
    public static int[][] takeInput()
    {
        return Array_2D.input();
    }
    public static int[][] transpose(int[][]a)
    {
        if(a.length!=a[0].length)
        {
            System.out.println("Invalid Matrix");
            System.exit(0);
        }
        int[][]tr = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                tr[j][i] = a[i][j];
        return tr;
    }
    public static void printTranspose(int[][]a)
    {
        a = transpose(a);
        Array_2D.printArr(a);
    }
    public static void isSymmetric(int [][] mat)
    {
        int [][] tr = transpose(mat);
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++)
                if (mat[i][j] != tr[i][j])
                {
                    System.out.println("Not Symmetric");
                    return;
                }
        System.out.println("Is Symmetric");
    }
    public static void main(String[] args)
    {
        int[][] a = takeInput();
        findGreatest(a);
        isSymmetric(a);
        printTranspose(a);
    }
}