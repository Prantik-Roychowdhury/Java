package TestFreshers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Question1
{
    public void answer()
    {
        ArrayList<String> movieSearches = new ArrayList<>();
        movieSearches.add("Stranger Things");
        movieSearches.add("The Vampire Dairies");
        movieSearches.add("Black Mirror");
        movieSearches.remove("The Vampire Dairies");
        System.out.println(movieSearches.get(1));
    }
}
class Question2
{
    public void answer()
    {
        ArrayList<String>courseList = new ArrayList<>();
        courseList.add("Maths");
        courseList.add("Physics");
        ArrayList<String>studentCourse = new ArrayList<>(courseList);
        studentCourse.remove("Physics");
        System.out.println(courseList.contains("Physics"));
    }
}
class Question3
{
    public void answer()
    {
        ArrayList<String>activities = new ArrayList<>();
        activities.add("Run 5k");
        activities.add("Walk 2k");
        activities.add("Run Marathon");
        Iterator<String>it = activities.iterator();
        while (it.hasNext())
        {
            String activity = it.next();
            if(activity.startsWith("Run"))
            {
                it.remove();
            }
        }
//      The above loop can be written like this:
//      activities.removeIf(activity -> activity.startsWith("Run"));
        System.out.println(activities);
    }
}
class Question4
{
    public void answer()
    {
        ArrayList<String>cart1 = new ArrayList<>();
        cart1.add("Shoes");
        cart1.add("T-shirt");
        ArrayList<String> cart2 = new ArrayList<>();
        cart2.add("T-shirt");
        cart2.add("Watch");
        cart1.removeAll(cart2);
        System.out.println(cart1);
    }
}
class Question5
{
    public void answer()
    {
        ArrayList<String>tickets = new ArrayList<>();
        tickets.add("T1");
        tickets.add("T2");
        tickets.remove("T2");
        ArrayList<String>auditCopy = new ArrayList<>(tickets);
        auditCopy.clear();
        try {
            System.out.println(tickets.get(1));
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }
}
class Question6
{
    public void answer()
    {
        ArrayList<String>list = new ArrayList<>();
        list.add("STRINGS");
        list.add("EXCEPTIONS");
        list.add("COLLECTIONS");
        list.add("DATA STRUCTURES");
        list.remove(2);
        Object[]array = list.toArray();
        for(Object object: array)
        {
            System.out.println(object);
        }
        try
        {
            list.remove(4);
        }
        catch (Exception e)
        {
            System.out.println("IndexOutOfBounds");
        }
    }
}
class  Question7
{
    public void answer()
    {
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(18);
        numbers.add(25);
        numbers.add(40);
        Iterator<Integer>numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext())
        {
            Integer num = numbersIterator.next();
            if(num%2!=0)
            {
                numbersIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
class Question8
{
    public void answer()
    {
        ArrayList<String>morningShift = new ArrayList<>();
        morningShift.add("Alice");
        morningShift.add("Bob");

        ArrayList<String>eveningShift = new ArrayList<>();
        eveningShift.add("Bob");
        eveningShift.add("Charlie");
        ArrayList<String>auditLog = new ArrayList<>(eveningShift);
        morningShift.addAll(eveningShift);
        morningShift.removeAll(eveningShift);
        System.out.println(auditLog);
        System.out.println(morningShift);
    }
}
class Question9
{
    public void answer()
    {
        ArrayList<String>names = new ArrayList<>();
        names.add("Smith");
        names.add("Martin");
        names.add("King");
        names.add("Adams");
        names.add("Scott");
        names.add("Allen");
        names.add("Jones");
        System.out.println(names.contains("Scott"));
        System.out.println(names.indexOf("King"));
        System.out.println(names.indexOf("jones"));
        System.out.println(names.lastIndexOf("Jones"));
        System.out.println(names.lastIndexOf("Allen"));
    }
}
class Question10
{
    public void answer()
    {
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.remove(1);
        numbers.add(5);
        System.out.println(numbers.contains(7));
        numbers.add(2);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
public class ArrayLists
{
    public static void callingMethod()
    {
        Question1 q1 = new Question1();
        Question2 q2 = new Question2();
        Question3 q3 = new Question3();
        Question4 q4 = new Question4();
        Question5 q5 = new Question5();
        Question6 q6 = new Question6();
        Question7 q7 = new Question7();
        Question8 q8 = new Question8();
        Question9 q9 = new Question9();
        Question10 q10 = new Question10();
        System.out.println("Question 1:");
        q1.answer();
        System.out.println("---------------------------------------------");
        System.out.println("Question 2");
        q2.answer();
        System.out.println("---------------------------------------------");
        System.out.println("Question 3");
        q3.answer();
        System.out.println("---------------------------------------------");
        System.out.println("Question 4");
        q4.answer();
        System.out.println("---------------------------------------------");
        System.out.println("Question 5");
        q5.answer();
        System.out.println("---------------------------------------------");
        System.out.println("Question 6");
        q6.answer();
        System.out.println("---------------------------------------------");
        System.out.println("Question 7");
        q7.answer();
        System.out.println("---------------------------------------------");
        System.out.println("Question 8");
        q8.answer();
        System.out.println("---------------------------------------------");
        System.out.println("Question 9");
        q9.answer();
        System.out.println("---------------------------------------------");
        System.out.println("Question 10");
        q10.answer();
    }
}