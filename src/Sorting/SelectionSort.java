package Sorting;

public class SelectionSort {
    void selectionSort(int a[]){    //method of selection sort;
        int n = a.length;
        int i,j,k;                 //variable declaration;
        int temp = 0;

        for(i=0; i<n-1; i++){             //for loop for every passes;
            for(j=k=i; j<n; j++){         //using for comparision
                if(a[j] < a[k]){          //check j<k if it's true then k is equal to j then 2 elements are swapping
                    k = j;

                    temp = a[k];
                    a[k] = a[i];
                    a[i] = temp;
                }

            }
        }
    }
    void display(int a[]){             //display function;
        int n = a.length;
        int i;

        for(i=0; i<n; i++){
            System.out.println(a[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {        //main method
        SelectionSort s = new SelectionSort();
        int a[] = {10,7,4,3,1,33};
        s.selectionSort(a);
        System.out.println("Array sorted");
        s.display(a);                              //calling display function for displaying sorted element

    }
}

//Complexity:
//• Best case: O(n2)
//• Worst case: O(n2)
//• Average case: O(n2)

//It has O(n2) time complexity, making it inefficient on large lists, and generally
//
//performs worse than the similar insertion sort. Selection sort is noted for its simplicity, and it has
//performance advantages over more complicated algorithms in certain situations,

//Applications:
//• (Real world application) Let’s consider you have 8 shoes pairs with sizes 6 to 13. You find them not in
//order. Their arrangement from smallest to largest will be an example of selection sort How it works
//• If small list needs to be sorted
//• The entire cost of swapping does not matter
//• checking of all the elements is compulsory
//• cost of writing to a memory matters like in flash memory (number of writes/swaps is O(n) as
//compared to O(n2) of bubble sort).

//Advantages are –
//• It is very simple and easy to understand.
//• Its performance is very good in case of small array’s or list’s.


//Disadvantages are:
//• It is very simple and easy to understand.
//• Similar to the bubble sort, the selection sort requires n-squared number of steps for sorting n
//elements.


