package Collection_Framework.linkedList;

import java.util.LinkedList;

public class LinkedListDemo
{
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.add(12);
        ll.add("12");
        ll.add(false);
        ll.add(null);
        System.out.println(ll);
        LinkedList<Integer>ll2 = new LinkedList<>();
        ll2.add(12);
        System.out.println(ll2);
    }
}