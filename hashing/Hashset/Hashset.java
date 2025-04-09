package hashing.Hashset;
import java.util.HashSet;
public class Hashset
{
    HashSet<Integer>set = new HashSet<>();//Same syntax like arraylist
    public void createHashSet()
    {
        //Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
    }
    public void search(int target)
    {
        if(set.contains(target))
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
    public void delete(int data)
    {
        set.remove(data);
    }
    public void getSize()
    {
        System.out.println("Size of set is: "+set.size());
    }
    public void displayAllElement()
    {
        System.out.println(set);
    }
}