package dataStructures.Queues;

public class DoubleEndedQueue
{
    static class Node
    {
        int data;
        Node next,prev;
        Node(int data)
        {
            this.data = data;
            this.prev = this.next = null;
        }
    }
    Node front, rear;
    public DoubleEndedQueue()
    {
        front = rear = null;
    }
    public boolean isEmpty()
    {
        return front==null;
    }
    public void insertAtFront(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            front=rear=newNode;
        }
        else
        {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }
    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
            front=rear=null;
        else
        {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }
    public int deleteAtFront()
    {
        if(isEmpty())
            throw new RuntimeException("Queue Empty");
        int value = front.data;
        front = front.next;
        if(front==null)
            rear = null;
        else
            front.prev=null;
        return value;
    }
    public int deleteAtEnd()
    {
        if(isEmpty())
            throw new RuntimeException("Queue Empty");
        int value = rear.data;
        rear = rear.prev;
        if(rear==null)
            front = null;
        else
            rear.next = null;
        return value;
    }
    public int getFront()
    {
        if(isEmpty())
            throw new RuntimeException("Queue is empty");
        return front.data;
    }
    public int getEnd()
    {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        return rear.data;
    }
    public void display()
    {
        Node temp = front;
        System.out.println("The Dequeue is: ");
        while (temp!=null)
        {
            System.out.print("{"+temp.data+"} ");
            temp = temp.next;
        }
        System.out.println();
    }
}