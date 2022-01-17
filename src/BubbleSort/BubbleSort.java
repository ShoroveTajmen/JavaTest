package BubbleSort;
public class BubbleSort {
    void bubblesort(int arr[]){             //method for bubblesort
        int n = arr.length;
        int temp = 0;
        int i,j;
        for(i = 0; i < n-1; i++)               //using for passes
            for(j = 0; j < n-i-1; j++)         //every passes we performing n-1 comparision and also when we performing
                                               //2nd comparision then one comparision should be reduce.
                                               //then if arr[j] is greater than arr[j+1] then they are swapping.
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j] ;
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    void display(int arr[]){                 //display function.
        int n = arr.length;
        int i;
        for(i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {            //main method
        BubbleSort b = new BubbleSort();
        int arr[] = {11,30,2,3,4,5,8};
        b.bubblesort(arr);
        System.out.println("Array sorted");
        b.display(arr);                                //display method calling for displaying the sorted element.
    }
}

//Complexity:
//• Best case: O(n)
//• Worst case: O(n2)
//• Average case: O(n2)

//Outcome:
//The algorithm is very simple and easy to implement. After performing it we can have a
//sorted list / array or dataset. For its simplicity programmers likes to implement it.

//Advantages are –
//• Easy to understand.
//• Easy to implement.
//• In-place, no external memory is needed.
//• Performs greatly when the array is almost sorted.

//Disadvantages are –
//• Very expensive, O(n2)O(n2)in worst case and average case.
//• It does more element assignments than its counterpart, insertion sort.
