

public class Selection {
    private static int partition(int[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        int v = a[lo];
        while (true) {
            while (a[++i] < v) if (i == hi) break;
            while (a[--j] > v) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    public static int select(int[] a, int k) {
        int lo = 0;
        int hi = a.length - 1;
        int j = 0;
        while(lo <= hi)
        {
            j = partition(a, lo, hi);
            if(j < k)         hi = j - 1;
            else if(j > k)    lo = j + 1;
            else                return a[j];
        }
        return a[j];
    }
    
    private static void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        int a[] = {9, 12, 3, 16, 32, 1, 5};
        int k = 3;
        int n = select(a, k);
        System.out.println(n);
    }
}
