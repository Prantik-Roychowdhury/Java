package Collection_Framework.Stacks;

import java.util.Stack;

public class stackDemo
{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        Stack s2 = new Stack();
        s2.push(10);
        s2.push(20);
        s2.push(30);
        System.out.println(s.search(10)+"\n"+s2.search(20));
    }
}