package M1;
import java.util.Scanner;

class UF
{
    private int id[];
    private int sz[];
    public UF(int n)
    {
        id = new int[n];
        sz = new int[n];
        for (int i = 0; i<n; i++)
        {
            id[i] = i;
            sz[i] = 0;
        }
    }
    public void union(int p, int q)
    {
        int pid = find(p);
        int qid = find(q);
        if (pid == qid)
        {
            return;
        }
        if (sz[pid] > sz[qid])
        {
            id[qid] = pid;
            sz[pid] = sz[pid] + sz[qid] + 1;
        }
        else
        {
            id[pid] = qid;
            sz[qid] = sz[pid] + sz[qid] + 1;
        }
    }
    public int find(int p)
    {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }
    public boolean connected(int p, int q)
    {
        return find(p) == find(q);
    } 
}



public class WeightedQU {
    public static void main(String[] args) {
        System.out.println("How many nodes are there? ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        UF obj = new UF(n);
        obj.union(4,3);
        obj.union(3,8);
        obj.union(6,5);
        obj.union(9,4);
        obj.union(2,1);
        boolean a = obj.connected(8,9);
        System.out.println(a);
    }
}
