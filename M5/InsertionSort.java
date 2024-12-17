import java.util.Comparator;

public class InsertionSort {

    public static void sort(Comparable<A>[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exchange(a, j, j-1);
            }
        }
    }

    private static boolean less(A v, A w) {
        return v.compareTo(w) < 0;
    }

    private static void exchange(A[] a, int i, int j) {
        A temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        String[] array = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        sort(array);
        for (String item : array) {
            System.out.print(item + " ");
        }
    }
}

class A implements Comparable<A> {
    public int compareTo(A otherA) {
        return 0;
    }
}