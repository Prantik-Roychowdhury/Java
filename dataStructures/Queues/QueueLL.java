package dataStructures.Queues;

public class QueueLL
{
    //Start of Nested Class
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
    //End of Nested Class
    Node front,rear;
    public int size;
    public QueueLL()
    {
        front = rear = null;
        this.size = 0;
    }
    public void enqueue(int data)
    {
        Node newNode = new Node(data);
        if(front==null)
        {
            front = rear = newNode;
            return;
        }
        else
        {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    public boolean isEmpty()
    {
        return front==null;
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Empty Queue. Nothing to delete");
        }
        int value = front.data;
        front = front.next;
        if(front==null)
            rear = null;
        return value;
    }
    public int peek()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Empty Queue. Nothing to delete");
        }
        return front.data;
    }
    public int getSize()
    {
        return ++size;
    }
    public void display()
    {
        Node temp = front;
        System.out.println("Queue: ");
        while (temp!=null)
        {
            System.out.print("{"+temp.data+"} ");
            temp = temp.next;
        }
        System.out.println();
    }
}