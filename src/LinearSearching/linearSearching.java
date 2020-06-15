package LinearSearching;

public class linearSearching {

    public static int Lsearch(int A[], int x) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (A[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int A[] = {2, 3, 4, 10, 40};
        int x = 10;

        int result = Lsearch(A, x);
        if (result == -1)
            System.out.print("Not founded");
        else
            System.out.print("Founded at index " + result);
    }
}
