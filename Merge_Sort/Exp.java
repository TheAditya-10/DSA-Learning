import java.util.Scanner;
public class Exp {
    public static void main(String[] args) 
    {
        System.err.println("Enter the number of elements followed by the elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Could impliment an choice condition for numbers or string at this point
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        sc.close();

        MergeSort is = new MergeSort();
        is.sort(arr, new int[arr.length], 0, arr.length - 1);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}