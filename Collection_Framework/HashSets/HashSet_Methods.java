package Collection_Framework.HashSets;

import java.util.HashSet;

public class HashSet_Methods
{
    public static void main(String[] args)
    {
        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(1.0);
        hs.add('1');
        hs.add("1");
        hs.add(null);
        System.out.println("Printing hashset:\n"+hs);
        System.out.println("Searching for element 1:\n"+hs.contains(1.0));
        System.out.println("Deleting an element:\n"+hs.remove(1.0));
    }
}