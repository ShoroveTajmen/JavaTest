package Insertion;

public class InsertionSort {
    static void display(int arr[]){       //using display method for displaying sorted element.

        int n = arr.length;
        for(int i=0; i<n; i++)
        System.out.println(arr[i]+ " ");

        System.out.println();
    }

    void insert(int arr[]){          //insertion method,,,,declare an array as a parameter;

        int i,j,x;                 //variable declaration;

        int n = arr.length;
        for( i=0; i<n; i++){      //using for loop for passes;
            j=i-1;                //i pointing last index and j should be point on i-1 index;
            x = arr[i];                //arr[i] assign variable x;

            while(j>-1 && arr[j]>x){        //while loop will continue j>-1 && arr[j]>x;
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;

        }

    }

    public static void main(String[] args) {           //main method
        int arr[] = {3,12,34,9,5,1};
        InsertionSort I = new InsertionSort();
        I.insert(arr);                                //calling insertion method;
        I.display(arr);                               //calling display method for displaying sorted element;
    }
}

//Sorting short lists.
// If you know your lists are never going to contain more than say
//25 elements, then insertion sort is an excellent choice.

//2. Sorting “almost sorted” lists.
// If you know that no element is more than say 25
//locations from its final location in sorted order (the data could have been produced
//from another program) or that at most say 25 elements are out of order (the remaining
//elements are already in sorted order), then insertion sort is again an excellent choice.

//Complexity:
//Best case: O(n)
//Worst case: O(n2)
//Average case: O(n2)
//• Efficient for small data sets, especially in practice than other quadratic algorithms — i.e. O(n2).
//• It only requires a constant amount of additional memory space — O(1)

//Disadvantage are -
//• For unsorted/reverse-sorted data, it's slow for large N.
//• With n-squared steps required for every n element to be sorted, the insertion sort does
//not deal well with a huge list.
//• Its performance is very poor when the data set is huge.


