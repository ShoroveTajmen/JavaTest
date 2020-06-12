package Sorting;

public class SelectionSort {
    void selectionSort(int a[]){
        int n = a.length;
        int i,j,k;
        int temp = 0;

        for(i=0; i<n-1; i++){
            for(j=k=i; j<n; j++){
                if(a[j] < a[k]){
                    k = j;

                    temp = a[k];
                    a[k] = a[i];
                    a[i] = temp;
                }

            }
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
        SelectionSort s = new SelectionSort();
        int a[] = {10,3,7,9,11,23};
        s.selectionSort(a);
        System.out.println("Array sorted");
        s.display(a);

    }




}


