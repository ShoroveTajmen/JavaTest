package Lab_Final;

import Insertion.InsertionSort;

public class Sortin2 {
    void insert(int arr[]) {

        int i, j, x;
        int n = arr.length;
        for (i = 0; i < n; i++) {
            j = i - 1;
            x = arr[i];

            while (j > -1 && arr[j] > x) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = x;

        }

    }
    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        return sum;
    }


    static void display(int arr[]){

        int n = arr.length;
        for(int i=0; i<n; i++)
            System.out.println(arr[i]+ " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,12,34,9,5,1};
        Sortin2 t = new Sortin2();
        t.insert(arr);
        t.display(arr);
        t.sum(arr);
    }

}

//sorry mam i can't run this code;
