package Collection_Framework.ArrayLists;

import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList l1 = new ArrayList();
        //Add element
        l1.add(10);
        l1.add(20);
        l1.add(30);
        System.out.println(l1);
        ArrayList l2 = new ArrayList(l1);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.addAll(l1);
        System.out.println(l2);
        System.out.println(l2.size());
        //Add elements at an index
    }
}