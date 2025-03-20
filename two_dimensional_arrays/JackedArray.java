package two_dimensional_arrays;

import java.util.Scanner;

public class JackedArray
{
    public static int[][] createJackedArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        int[][]a = new int[row][];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("How many columns do you want for row: "+i);
            int n = sc.nextInt();
            a[i] = new int[n];
        }
        System.out.println("Enter array elements");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
                a[i][j] = sc.nextInt();
        }
        return a;
    }
    public static void printJackedArray(int[][]a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int[][]a = createJackedArray();
        printJackedArray(a);
    }
}