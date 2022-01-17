package Lab_Final;

import java.util.Scanner;

public class Sorting2 {
    public static void main(String[] args) {

        int n,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of element you want in array: ");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            sum = sum+arr[i];
        }

        //sorting
        int i,j,x;
        for( i=0; i<n; i++){
            j=i-1;
            x = arr[i];

            while(j>-1 && arr[j]>x){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;

        }
        System.out.print("Array after Sorting is : \n");
        for(i=0; i<n; i++)
        {
            System.out.print(arr[i] + "  ");
        }

        System.out.println(" ");



        System.out.println("sum: " +sum);
        int t,s1=0,remainder;
        t = sum;
        while (t != 0)
        {
            remainder = t % 10;
            s1 = s1 + remainder;
            t = t / 10;
        }
        System.out.println("Digits sum:" +s1);




    }
}
