package M1;
class ArrayStackofString
{
    private String[] s = new String[1];
    private int N = 1;

    public boolean isEmpty()
    {
        return N == 0;
    }
    public void resize(int cap)
    {
        String[] copy = new String[cap];
        for(int i = 0; i<s.length; i++)
        {
            copy[i] = s[i];
        }
        s = copy;
    }

    public void push(String item)
    {
        if (N == s.length)
        {
            resize(2 * s.length);
        }
        s[N++] = item;
    }

    public String pop()
    {
        String item = s[--N];
        s[N] = null;
        if (N == s.length/4 && N > 0)
        {
            resize(s.length/2);
        }
        return item;
    }
}
class LinkedStackOfString
{
    private class Node {
        String item;
        Node next;        
    }
    Node first = null;

    public boolean isEmpty()
    {
        return first == null;
    }
    public void push(String item)
    {
        Node old = first;
        first = new Node();
        first.item = item;
        first.next = old;
    }
    public String pop()
    {
        String item = first.item;
        first = first.next;
        return item;
    }
}

public class StackOfStrings {
    public static void main(String[] args) {
        
        ArrayStackofString stk = new ArrayStackofString();
        String my = "My";
        stk.push(my);
        stk.push("name ");
        stk.push("is ");
        String r = stk.pop();
        stk.push("Aditya ");
        System.out.println(r);
        
    }
}