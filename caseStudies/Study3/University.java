package caseStudies.Study3;

public class University
{
    private Person [] people;
    University(int numberOfPeople)
    {
        people = new Person[numberOfPeople];
    }
    public void addPerson(Person p)
    {
        for(int i=0; i<people.length; i++)
        {
            if(people[i]==null)
            {
                people[i] = p;
                return;
            }
        }
        System.out.println("Cannot add");
    }
    public void showPeople()
    {
        for (Person p: people)
        {
            if(p!=null)
            {
                if(p instanceof Student)
                {
                    ((Student)p).displayStudentInfo();
                }
                else if (p instanceof Professor)
                {
                    ((Professor)p).displayProfessorInfo();
                }
                else
                    p.displayInfo();
                System.out.println("-----------------------------------------------------------------------");
            }
        }
    }
}