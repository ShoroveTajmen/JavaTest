package ArrayInsertDelete;

public class InsertionDeletion {
    void Display(int arr[],int n){
        int i;
         n = arr.length;

        System.out.println("\n Elements are\n");
        for(i=0; i<n; i++){
            System.out.println(arr[i]+ " ");
        }
    }

    void Insertion(int arr[],int index,int key,int n){
        int i;
         n=arr.length;
        if(index >= 0 && index <= n){
            for(i=n; i>index; i--){
                arr[i] = arr[i-1];
            }
            arr[index] = key;
            n++;

        }

    }

    public static void main(String[] args) {

        InsertionDeletion ID = new InsertionDeletion();

        int arr[] = {10,20,30,40,50};
        int key = 60;


        ID.Insertion(arr,3,60,10);
        ID.Display(arr,10);

    }
}
