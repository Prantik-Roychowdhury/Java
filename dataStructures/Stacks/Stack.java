package dataStructures.Stacks;
//Implementation using arrays
public class Stack
{
    int top = -1;
    int size;
    int[] arr;
    Stack(int size)
    {
        this.size = size;
        arr = new int[size];
    }
    public boolean isFull()
    {
        return (top==(size-1));
    }
    public boolean isEmpty()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return true;
        }
        return false;
    }
    public void push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedElement = arr[top];
        top --;
        return poppedElement;
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Nothing to return");
            return -1;
        }
        return arr[top];
    }
    public void display()
    {
        System.out.println("Stack Elements from top");
        for(int i=top; i>=0; i--)
            System.out.print("["+arr[i]+"] ");
    }
}