package caseStudies.Study1;

public class Person
{
    private String name;
    private int age;
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void displayDetails()
    {
        System.out.println("Name: "+name+"\nAge: "+age);
    }
}