package caseStudies.Study3;

public class Driver
{
    public static void main(String[] args)
    {
        University un = new University(3);
        Student s = new Student("Rohit",27,1243124312);
        Professor p = new Professor("Chirodeep",40,"AI");
        Student student = new Student("Naveem",22,458789);
        un.addPerson(s);
        un.addPerson(p);
        un.addPerson(student);
        un.showPeople();
    }
}