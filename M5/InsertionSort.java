
public class InsertionSort 
{
    public void sort(Comparable[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                if(less(arr[j], arr[i]))
                {
                    exch(arr, i, j);
                }
            }
        }
    }

    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }            

    private static void exch(Comparable[] arr, int i, int j)   
    {
        Comparable t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    private static boolean isSorted(Comparable[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            if(less(arr[i], arr[i - 1]))
                return false;
        }
        return true;
    }
}