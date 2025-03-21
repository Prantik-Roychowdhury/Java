package oops;

import java.util.Scanner;

public class Books
{
    String title;
    String author;
    double price;

    public Books(String title_name, String author_name, double getPrice)
    {
        title = title_name;
        author = author_name;
        price = getPrice;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book name, Author name and price");
        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = sc.nextDouble();
        Books b = new Books(title,author,price);
    }
}