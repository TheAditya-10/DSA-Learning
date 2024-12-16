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
class LinkedQueue<item>
{
    private class Node {
        item item;
        Node next;        
    }
    private Node first,last;

    public boolean isEmpty()
    {
        return first == null;
    }
    public void enque(item item)
    {
        Node old = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())
        {
            first = last;
        }
        else
        {
            old.next = last;
        }
    }
    public item dequeue()
    {
        item item = first.item;
        first = first.next;
        if(isEmpty()) last = null;
        return item;
    }
}

public class Queue {
    public static void main(String[] args) {
        
        LinkedQueue<Integer> stk = new LinkedQueue<Integer>();
        stk.enque(1);
        stk.enque(2);
        stk.enque(3);
        Integer r = stk.dequeue();
        stk.enque(4);
        System.out.println(r);
        
    }
}