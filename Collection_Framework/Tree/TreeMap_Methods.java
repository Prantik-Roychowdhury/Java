package Collection_Framework.Tree;

import java.util.*;

public class TreeMap_Methods
{
    public static void main(String[] args)
    {
        TreeMap<String, List<String>> map = new TreeMap<>();
        List<String>l1 = Arrays.asList("Hyd","Bangalore","Kolkata");
        List<String>l2 = Arrays.asList("J&K","Assam","Mizoram");
        List<String>l3 = Arrays.asList("Hubli","Dharwad","Bhilwara");
        map.put("SBI", l1);
        map.put("ICICI", l2);
        map.put("Federal", l3);
        System.out.println(map);
        Set<Map.Entry<String, List<String>>> s = map.entrySet();
        for (Map.Entry<String, List<String>> e:s)
        {
            System.out.println(e.getKey()+"--->"+e.getValue());
        }
    }
}