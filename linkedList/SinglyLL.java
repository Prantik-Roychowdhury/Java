package linkedList;

public class SinglyLL
{
    Node head;
    Node tail;
    static int count;
    public void insertAtEnd(int data)
    {
        Node node = new Node(data);
        if(head==null)
        {
            head = node;    //Creation of the LinkedList
            tail = node;    //Creation of the LinkedList
            count++;        //Creation of the LinkedList
        }
        else
        {
            tail.next = node;
            tail = node;
            count++;
        }
    }
    public void display()
    {
        while (head != null) //Do not change the head variable use the temp variable, because once the head is lost, the entire list is also lost
        {                    //Always use a temp variable to store the head node
            System.out.print("["+head.data+"]"+"->"); //We can also use error string in the format of System.err.print() -> Prints the strng in red colour
            head = head.next;
        }
        if(head == null)
            System.out.println("null");
    }
    public void insertAtPosition(int data, int position)
    {
        Node temp = head;
        if(position<0)
        {
            System.out.println("Invalid Position");
            return;
        }
        Node newNode = new Node(data);
        int cp = 0;
        while (temp!=null && cp>position-1)
        {
            temp = temp.next;
            cp++;
        }
        if(temp == null)
        {
            System.out.println("Position Exceeded");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void insertAtHead(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void deleteAtHead()
    {
        if(head==null)
            return;
        head = head.next;
    }
    public void deleteAtPosition(int position)
    {
        Node temp
    }
}