package Lab_Final;

import Insertion.InsertionSort;

public class Sorting1 {
    void insert(int arr1[]){

        int i,j,x;
        int n = arr1.length;
        for( i=0; i<n; i++){
            j=i-1;
            x = arr1[i];

            while(j>-1 && arr1[j]>x){
                arr1[j+1] = arr1[j];
                j--;
            }
            arr1[j+1] = x;

        }

    }

    static double median(int arr[], int n){
        if (n % 2 != 0)                       //if even
            return (double)arr[n / 2];

        return (double)(arr[(n - 1) / 2] + arr[n / 2]) / 2.0;  //if odd


    }
    static void display(int arr[]){

        int n = arr.length;
        for(int i=0; i<n; i++)
            System.out.println(arr[i]+ " ");

        System.out.println();
    }


    public static void main(String[] args) {
        int arr1[] = {1,5,9,3,7};
        int arr2[] ={3,4,5,67,9};
        int n = arr1.length;
        Sorting1 I = new Sorting1();
        I.insert(arr1);
        System.out.println("sort: ");
        I.display(arr1);
        I.median(arr1,n);
        System.out.println("Median value: " + median(arr1, n));

    }
}
