package Insertion;

public class InsertionSort {
    static void display(int arr[]){

        int n = arr.length;
        for(int i=0; i<n; i++)
        System.out.println(arr[i]+ " ");

        System.out.println();
    }

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

    public static void main(String[] args) {
        int arr[] = {3,12,34,9,5,1};
        InsertionSort I = new InsertionSort();
        I.insert(arr);
        display(arr);
    }
}
