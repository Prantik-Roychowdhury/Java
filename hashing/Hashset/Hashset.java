package hashing.Hashset;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset
{
    HashSet<Integer>set = new HashSet<>();//Same syntax like arraylist
    public void createHashSet(int data)
    {
        set.add(data);
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
        int size = set.size();
        if(isEmpty())
            throw new RuntimeException("Empty Set");
        set.remove(data);
        --size;
    }
    public int getSize()
    {
        //System.out.println("Size of set is: "+set.size());
        return set.size();
    }
    public void displayAllElement()
    {
        System.out.println(set);
    }
    public boolean isEmpty()
    {
        return getSize()==0;
    }
    public void printHasSet()
    {
        Iterator<Integer> it = set.iterator();
        System.out.println("Iterating through HashSet: ");
        while (it.hasNext())
            System.out.println(it.next());
    }
}