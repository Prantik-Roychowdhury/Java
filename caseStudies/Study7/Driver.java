package caseStudies.Study7;

public class Driver
{
    public static void main(String[] args)
    {
        Pet p = new Pet("Tommy","Dog");
        Person person = new Person("John",20);
        person.addPet(p);
        for (Pet personPet : person.getPets()) {
            System.out.println(personPet.getName()+" "+personPet.getSpecies());
        }

    }
}