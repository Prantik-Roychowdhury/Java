package dataStructures.Stacks;

public class StackLL
{
    //Nested Class
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    //End of nested class
    Node top;
    public StackLL()
    {
        top = null;
    }
    public boolean isEmpty()
    {
        return top==null;
    }
    public void push(int data)
    {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }
    public int pop()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Stack Underflow");
        }
        int value = top.data;
        top = top.next;
        return value;
    }
    public int peek()
    {
        if(isEmpty())
            throw new RuntimeException("StackUnderflow");
        return top.data;
    }

    public void display()
    {
        Node current = top;
        System.out.println("Stack:");
        while (current!= null)
        {
            System.out.print("["+current.data+"] ");
            current = current.next;
        }
        System.out.println();
    }
}