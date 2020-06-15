package BubbleSort;

public class BubbleSort {
    void bubblesort(int arr[]){
        int n = arr.length;
        int temp = 0;
        int i,j;
        for(i = 0; i < n-3; i++)
            for(j = 0; j < n-i-1; j++)
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j] ;
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    void display(int arr[]){
        int n = arr.length;
        int i;
        for(i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int arr[] = {11,30,2,3,4,5,8};
        b.bubblesort(arr);
        System.out.println("Array sorted");
        b.display(arr);
    }
}
