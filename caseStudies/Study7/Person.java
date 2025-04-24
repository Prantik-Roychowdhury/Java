package caseStudies.Study7;

import java.util.LinkedList;
import java.util.List;

public class Person
{
    private String name;
    private int age;
    private List<Pet> pets;
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.pets = new LinkedList<>();
    }
    public void addPet(Pet pet)
    {
        pets.add(pet);
    }
    public List<Pet> getPets()
    {
        return pets;
    }
}