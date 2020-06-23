package Sorting1;

import Sorting.SelectionSort;

public class MergeSort {
    void Merge(int a[],int L,int mid,int H){

        int i=L,j=mid+1,k=L;
        int[] B = new int[100];

        while(i<=mid && j<=H)
           {
            if(a[i]<a[j])
                B[k++] = a[i++];
            else
                B[k++] = a[j++];
            }

        for(;i<=mid;i++)
            B[k++]=a[i];
        for(;j<=H;j++)
            B[k++]=a[j];

        for( i=L;i<=H;i++)
            a[i] = B[i];
    }


     void MergeSort(int a[], int L, int H){
        int mid;
        if(L<H){
            mid = (L+H)/2;
            MergeSort(a,L,mid);
            MergeSort(a,mid+1,H);
            Merge(a,L,mid,H);

        }
    }

    void display(int a[]){
        int n = a.length;
        int i;

        for(i=0; i<n; i++){
            System.out.println(a[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MergeSort M = new MergeSort();

        int a[] = {10,3,7,9,11,23,8,1,5,4};
        M.MergeSort(a,0,9);

        System.out.println("Sorted Element");
        M.display(a);

    }
}
