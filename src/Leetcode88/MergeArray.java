package Leetcode88;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n,int[]arr3) {
        int i=0,j=0,k=0;
        while (i<m && j <n)
        {
            if (nums1[i] < nums2[j])
                arr3[k++] = nums1[i++];
            else
                arr3[k++] = nums2[j++];
        }
        while (i < m)
            arr3[k++] = nums1[i++];
        while (j < n)
            arr3[k++] = nums2[j++];
        Arrays.sort(arr3);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Number of elements you want in array:");
        int m = s.nextInt();
        int n = s.nextInt();


        int[] nums1 = new int[m];
        int[] nums2 = new int[n];
        System.out.println("Enter all the elements:");
        for(int i=0; i<m; i++){
            nums1[i]=s.nextInt();
        }
        System.out.println("second array element:");
        for(int j=0; j<n; j++){
            nums2[j]=s.nextInt();
        }
        int[] arr3 = new int[m+n];
        merge(nums1,m,nums2,n,arr3);

        System.out.println("Array after merging");
        for (int i=0; i < m+n; i++)
            System.out.print(arr3[i] + " ");


    }
}
