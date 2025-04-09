package linkedList.circularLinkedList;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class CircularLL
{
    Node head;
    public CircularLL()
    {
        this.head = null;
    }
    public void insertAtBeginning(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            newNode.next = newNode;
        }
        else
        {
            Node temp = head;
            while (temp.next!=head)
            {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        head = newNode;
    }
    public void insertAtEnd(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            node.next = node;
            head = node;
        }
        else
        {
            Node temp = head;
            while (temp.next != head)
            {
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
        }
    }
    public void insertAtPosition(int index, int data)
    {
        Node newNode = new Node(data);

        // Handle case when the list is empty (head is null)
        if (head == null)
        {
            if (index == 0)
            {
                newNode.next = newNode;  // Pointing to itself in a circular list
                head = newNode;
            } else
            {
                throw new IndexOutOfBoundsException("Invalid index");
            }
        }
        // Handle insertion at the start (index 0)
        else if (index == 0)
        {
            Node temp = head;
            // Traverse to the last node to make it point to the new node
            while (temp.next != head)
            {
                temp = temp.next;
            }
            temp.next = newNode;  // Last node's next should point to the new node
            newNode.next = head;  // New node's next points to the head
            head = newNode;       // Update head to point to the new node
        }
        // Handle insertion at any other position
        else
        {
            Node temp = head;
            int count = 0;

            // Traverse the list to the specified position
            while (count < index - 1 && temp.next != head)
            {
                temp = temp.next;
                count++;
            }

            // If the position is out of bounds
            if (count != index - 1)
            {
                throw new IndexOutOfBoundsException("Invalid index");
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public void update(int index, int newValue)
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        int len = 1;
        Node temp = head;
        while (temp.next != head)
        {
            len++;
            temp = temp.next;
        }
        if(index<0 || index>= len)
        {
            System.out.println("Invalid index");
            return;
        }
        Node current = head;
        for(int i = 0; i < index; i++)
        {
            current = current.next;
        }
        current.data = newValue;
    }
    public void deletion(int index)
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        int len = 1;
        Node temp = head;
        while (temp.next != head)
        {
            len++;
            temp = temp.next;
        }
        if(index<0 || index>= len)
        {
            System.out.println("Invalid index");
            return;
        }
        if(index==0)
        {
            if(head.next == head)
            {
                head.data = -1;
                head.next = null;
                return;
            }
            head.data = head.next.data;
            head.next = head.next.next;
            return;
        }
        Node prev = head;
        for(int i=0; i<index-1; i++)
        {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }
    public void printList()
    {
        Node temp = head;
        if (head == null)
        {
            System.out.println("No value to be printed");
            return;
        }
        do
        {
            System.out.print("["+temp.data+"] ");
            temp = temp.next;
        }while (temp!=head);
    }
}