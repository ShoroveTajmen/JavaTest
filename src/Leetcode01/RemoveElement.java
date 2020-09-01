package Leetcode01;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public int removeElement(int a[],int val){
    int n=a.length;
    int final_size = 0;
    int i;

        if(n==0){
        return 0;
    }
        for(i=0; i<n; i++){
        if(a[i] != val){
            a[final_size] = a[i];
            final_size++;
        }
    }
        return final_size;

}
    public static void main(String[] args) {
        RemoveElement r = new RemoveElement();
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of element you want in array: ");
        n = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = s.nextInt();
        }
        System.out.println("Which elemnt to delete: ");
        int val = s.nextInt();
        System.out.println("Final result is:" +r.removeElement(a,val));
        System.out.println(Arrays.toString(a));
    }
}


