package Lab_Final;

import Insertion.InsertionSort;

public class Sorting1 {
    void insert(int arr[]){

        int i,j,x;
        int n = arr.length;
        for( i=0; i<n; i++){
            j=i-1;
            x = arr[i];

            while(j>-1 && arr[j]>x){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;

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
        int arr[] = {1,5,9,3,7};
        int n = arr.length;
        Sorting1 I = new Sorting1();
        I.insert(arr);
        System.out.println("sort: ");
        I.display(arr);
        I.median(arr,n);
        System.out.println("Median value: " + median(arr, n));

    }
}
