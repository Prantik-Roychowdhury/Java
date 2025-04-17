package linkedList.doublyLinkedList;
class Node
{
    int data;
    Node prev;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DoublyLL
{
    Node head;
    Node tail;
    int size;
    public DoublyLL()
    {
        this.head = null;
        this.size = 0;
    }
    public void insertAtHead(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
        }
        else
        {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
    public void insertAtIndex(int index, int data, int size)
    {
        if(index<0 || index>size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + "Size: " + size);
        }
        //The new node that is to be added into the linked list
        Node newNode = new Node(data);
        if(index==0)
        {
            insertAtHead(data);
        }
        else
        {
            Node current = head;
            for(int i=0; i<index-1; i++) //Loop to iterate to the element before the provided index, to break the connection and to create a new connection to the added element
            {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            if(current.next!=null)
            {
                current.next.prev = newNode;
            }
            current.next = newNode;
        }
        size++;
    }
    public void reverse()
    {
        Node current = head;
        Node temp = null;
        while (current!=null)
        {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if(temp!=null)
        {
            head = temp.prev;
        }
    }
    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data); // Create a new node with the given data

        // If the list is empty, make the new node both head and tail
        if (head == null)
        {
            head = newNode;
            tail = newNode;
            return;
        }

        // Otherwise, insert the new node at the end
        tail.next = newNode;  // Make the current tail's next point to the new node
        newNode.prev = tail;  // Make the new node's previous point to the current tail
        tail = newNode;       // Update the tail to the new node
    }
    public void displayReverse()
    {
        reverse();
        display();
    }
    public void display()
    {
        Node node = head;
        while (node!=null)
        {
            System.out.print("["+node.data+"] ->");
            node = node.next;
        }
    }
}