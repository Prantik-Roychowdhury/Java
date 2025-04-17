package Collection_Framework.Sets;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetFunctions
{
    public static void main(String[] args)
    {
        TreeSet<Integer>ts = new TreeSet<>();
        ts.add(10);
        ts.add(2);
        ts.add(8);
        ts.add(30);
        ts.add(1);
        System.out.println("Printing the Tree Set: "+ts);
        System.out.println("Ceiling Method: "+ts.ceiling(3));
        System.out.println("Headset function with 1 parameter: "+ts.headSet(4));
        System.out.println("Headset function with 2 parameters: "+ts.headSet(4,true));
        System.out.println("Headset function with 2 parameters: "+ts.headSet(4,false));
        System.out.println("Lower Method: "+ts.lower(10));
        SortedSet<Integer>ss = ts.tailSet(0);
        System.out.println("Sorted Set:\n "+ss);
        NavigableSet<Integer> n = ts.tailSet(0,true);
        System.out.println("Navigable Set: \n"+n);
        NavigableSet<Integer>m = ts.tailSet(0,false);
        System.out.println("Navigable Set with False:\n"+m);

    }
}
