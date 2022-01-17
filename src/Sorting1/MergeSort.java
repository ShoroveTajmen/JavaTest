package Sorting1;

import Sorting.SelectionSort;

public class MergeSort {
    void Merge(int a[],int L,int mid,int H){    //merging method

        int i=L,j=mid+1,k=L;                  //initially assign i=low,j=mid+1,k=low;
        int[] B = new int[100];               //dynamically allocate array with max size;

        while(i<=mid && j<=H)                //loop will working i<=mid & j<=high
           {
            if(a[i]<a[j])                    //if array i< array j  then B array te A array i ar value assign hbe & both are increment
                                             //else array B te array j ar value assign hbe and increment hbe 2 ta array;
                B[k++] = a[i++];
            else
                B[k++] = a[j++];
            }

        for(;i<=mid;i++)                     //using for beacause of if array i e remaining value thake tahole array B te i ar
                                            //value assign hbe;
            B[k++]=a[i];
        for(;j<=H;j++)                      //same as array j;
            B[k++]=a[j];

        for( i=L;i<=H;i++)                  //at last array B array A te assign hye jbe for reduce space complexity;
            a[i] = B[i];
    }
     void MergeSort(int a[], int L, int H){        //recursion method for merging;
        int mid;
        if(L<H){
            mid = (L+H)/2;
            MergeSort(a,L,mid);
            MergeSort(a,mid+1,H);
            Merge(a,L,mid,H);                   //calling merge sort for partitioning;
        }
    }
    void display(int a[]){                     //using display method for displaying sorted array;
        int n = a.length;
        int i;
        for(i=0; i<n; i++){
            System.out.println(a[i] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {         //main method
        MergeSort M = new MergeSort();
        int a[] = {14,7,3,12,9,11,6,2};
        M.MergeSort(a,0,7);

        System.out.println("Sorted Element");
        M.display(a);
    }
}

//It is a divide and conquer algorithm
//Applications:
//• Merge Sort is useful for sorting linked lists in O(nLog(n)) time.
//• Inversion count problem.
//• Used in external sorting.

//Complexity:
//• Best case: O(n log n)
//• Worst case: O(n log n)
//• Average case: O(n log n)

//Advantages are –
//• It is quicker for larger lists because unlike insertion and bubble sort it doesnt go through the whole list
//several times.
//• It has a consistent running time, carries out different bits with similar times in a stage.


//Disadvantages are:
//• Slower comparative to the other sort algorithms for smaller tasks.
//• Goes through the whole process even the list is sorted (just like insertion and bubble sort)
//• Uses more memory space to store the sub elements of the initial split list.
