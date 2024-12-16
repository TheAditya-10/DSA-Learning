package M1;

public class ThreeSum {
    
    public static int count(int[] a)
    {
        int len = a.length;
        int count = 0;

        for (int i = 0; i < len; i++)
        {
            for (int j = 0; j < len; j++)
            {
                for (int k = 0; k < len; k++)
                {
                    if(a[i] + a[j] + a[k] == 0)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int c = count(a);
        long start = System.nanoTime();
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.err.println(c);
        System.err.println(timeElapsed + " ns");
    }
}
