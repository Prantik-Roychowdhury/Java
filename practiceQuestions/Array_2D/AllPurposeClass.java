package practiceQuestions.Array_2D;

import java.util.Scanner;

public class AllPurposeClass
{
    static Scanner sc = new Scanner(System.in);
    public static int[][] input()
    {
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of columns");
        int m = sc.nextInt();
        int[][]a = new int[n][m];
        System.out.println("Enter Array Elements");
        for (int i=0; i<a.length; i++)
        {
            for(int j=0; j<m; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        return a;
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
    public static int sum_of_diagonals(int[][]a)
    {
        int s1 = 0, s2 = 0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(i==j)
                    s1+=a[i][j];
            }
        }
        for(int i=a.length-1; i>=0; i--)
        {
            for(int j=a[0].length; j>=0; j--)
            {
                if(i==j)
                    s2+=a[i][j];
            }
        }
        return s1+s2;
    }
    public static void printArray(int[][]a)
    {
        for (int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<a[0].length; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}