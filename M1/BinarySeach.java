package M1;
public class BinarySeach {
    public static int search(int a[], int key)
    {
        int l = 0;
        int h = a.length-1;
        while(l <= h)
        {
            int mid = (l+h)/2;   
            if(key > a[mid])
            {
                l = mid + 1;
            }
            else if(key < a[mid])
            {
                h = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        if (l > h)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int key = 5;
        int index = search(a, key);
        System.err.println(index);
    }
}
