package Collection_Framework.Tree;

import java.util.TreeMap;

public class TreeMap_Methods
{
    public static void main(String[] args)
    {
        TreeMap tm = new TreeMap((o1,o2)->(Integer)o2-(Integer)o1);
        tm.put(1, "Hi");
        tm.put(3, "Hello");
        tm.put(2, null);
        tm.put(3, "Fk u");
        System.out.println(tm);
        System.out.println(tm.containsValue("Hello"));
    }
}