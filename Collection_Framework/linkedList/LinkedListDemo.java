package Collection_Framework.linkedList;

import java.util.LinkedList;

public class LinkedListDemo
{
    public static void operations()
    {
        LinkedList<Integer>ll = new LinkedList<>();
        ll.addFirst(12);
        ll.add(2233);
        ll.addLast(78);
        ll.addLast(77);
        System.out.println("Linked List:\n"+ll);
        System.out.println("Popping: "+ll.pop());
    }
    public static void main(String[] args)
    {
        operations();
    }
}