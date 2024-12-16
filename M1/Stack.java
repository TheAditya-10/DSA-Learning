package M1;
class ArrayStack<item>
{
    private item[] s = (item[]) new Object[1];
    private int N = 1;

    public boolean isEmpty()
    {
        return N == 0;
    }
    public void resize(int cap)
    {
        item[] copy = (item[]) new Object[cap];
        for(int i = 0; i<s.length; i++)
        {
            copy[i] = s[i];
        }
        s = copy;
    }

    public void push(item item)
    {
        if (N == s.length)
        {
            resize(2 * s.length);
        }
        s[N++] = item;
    }

    public item pop()
    {
        item item = s[--N];
        s[N] = null;
        if (N == s.length/4 && N > 0)
        {
            resize(s.length/2);
        }
        return item;
    }
}
class LinkedStack<item>
{
    private class Node {
        item item;
        Node next;        
    }
    Node first = null;

    public boolean isEmpty()
    {
        return first == null;
    }
    public void push(item item)
    {
        Node old = first;
        first = new Node();
        first.item = item;
        first.next = old;
    }
    public item pop()
    {
        item item = first.item;
        first = first.next;
        return item;
    }
}

public class Stack {
    public static void main(String[] args) {
        
        ArrayStack<Integer> stk = new ArrayStack<Integer>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        Integer r = stk.pop();
        stk.push(4);
        System.out.println(r);
        
    }
}