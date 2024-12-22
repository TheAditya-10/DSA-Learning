import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) 
    {
        System.err.println("Enter the number of elements followed by the elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.next();
        }
        sc.close();
        SelectionSort is = new SelectionSort();
        is.sort(arr);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}