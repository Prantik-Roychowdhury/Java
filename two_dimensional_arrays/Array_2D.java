package two_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2D
{
    static Scanner sc = new Scanner(System.in);
    public static int[][] input()
    {
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        System.out.println("Enter array elements");
        for (int i=0; i<n; i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }
    public static void printArr(int[][]a)
    {
        System.out.println("The array elements are:");
        for (int i=0; i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
    public static void printInSingleLine(int[][]a)
    {
        System.out.println(Arrays.deepToString(a));
    }
    public static void printForEach(int[][]a)
    {
        for (int[]row:a)
        {
            for(int i:row)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int[][]a = input();
        System.out.println("Normal Loop");
        printArr(a);
        System.out.println("\nUsing deepToString method");
        printInSingleLine(a);
        System.out.println("\nUsing For Each Loop");
        printForEach(a);
    }
}