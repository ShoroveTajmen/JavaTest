package Sorting3;

public class QuickSort {
    int partition(int A[], int low, int high) {          //method for partitioning;
        int pivot, i, j;
        pivot = A[low];
        i = low;                                     //starting point;
        j = high;                                    //ending point;
        do {
            do
            {i++;} while (A[i] <= pivot);     //using do while loop .....'i' should move if i<=pivot,,,,'i' should
                                              //stop when i > pivot;

            do
            {j--;} while (pivot < A[j]);     //'j' should move if j>pivot & stop when j<=pivot;

            if (i < j) {                      // if i<j then swapping;

                int temp = A[j];
                A[j] = A[i];               //prothom do whilw loop ta cholbe jotokhon porjonto i ar index j ar index
                                           //theke choto thakbe ....jokhon e i ar index ta boro hye jabe tokhon pivot ar sathe
                                           //j index ar swap hbe and j return krbe...
                A[i] = temp;
            }
        }
        while (i < j) ;
       int temp = A[j];
        A[j] = A[low];
        A[low] = temp;
        return j;

    }

    void QuickSort(int A[],int low,int high){    //recursion method
        int p;
        if(low<high){
            p = partition(A, low, high);
            QuickSort(A,low,p);
            QuickSort(A, p +1,high);
        }
    }



    void display(int A[]){                       //displaying sorted element
        int n = A.length;
        int i;

        for(i=0; i<n; i++){
            System.out.println(A[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {                 // main method
        QuickSort Q = new QuickSort();
        int A[] = {1,9,1,1,5,2,7,2,7, Integer.MAX_VALUE};
        Q.QuickSort(A,0,A.length-1);
        System.out.println("Sorted");
        Q.display(A);

    }
}


//Applications:
//It is Very popular sequential sorting algorithm that performs well with an average sequential time
//complexity of O(nlogn). Well it’s applications are similar with other sorting algorithms. such as:
//• Commercial computing.
//• Search for information.
//• Operations research.
//• Event-driven simulation.
//• Numerical computations.

   // it is still a commonly used algorithm for sorting.
//it can be about two or three
//times faster than its main competitors, merge sort and heapsort. It is a divide-and-conquer algorithm.


//Complexity:
//• Best case: O(n2)
//• Worst case: O(n log n)
//• Average case: O(n log n)

//    Advantages are –
//       • high performance, easy implementation, can easily combine with caching and internal memory
//        mechanisms.
//        Disadvantages are:
//        • Unstable, heavily decreases in speed down to O(n2) in the case of unsuccessful pivot
//        selections. Lame implementation of the algorithm may result in stack overflow error, since it may
//        require O(n) embedded recursive calls.

