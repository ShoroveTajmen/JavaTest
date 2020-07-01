package Sorting3;

import Sorting.SelectionSort;

import java.util.Arrays;

public class QuickSort {
    int partition(int A[], int low, int high) {
        int pivot, i, j;
        pivot = A[low];
        i = low;
        j = high;
        do {
            do
            {i++;} while (A[i] <= pivot);

            do
            {j--;} while (pivot < A[j]);

            if (i < j) {

                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }
        while (i < j) ;
       int temp = A[j];
        A[j] = A[low];
        A[low] = temp;
        return j;
    }

    void QuickSort(int A[],int low,int high){
        int p;
        if(low<high){
            p = partition(A, low, high);
            QuickSort(A,low,p);
            QuickSort(A, p +1,high);
        }
    }

    private int getP(int p) {
        return p;
    }

    void display(int A[]){
        int n = A.length;
        int i;

        for(i=0; i<n; i++){
            System.out.println(A[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QuickSort Q = new QuickSort();
        int A[] = {10,3,7,9,11,23,8,3,2,1, Integer.MAX_VALUE};
        Q.QuickSort(A,0,A.length-1);
        System.out.println("Sorted");
        Q.display(A);

    }
}



