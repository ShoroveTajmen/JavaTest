package Leetcode35;

import java.util.Scanner;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = (nums.length-1);
        int mid = (first+last)/2;
        while(first<=last){
             mid =(first+last)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]<target){
                first = mid+1;
            }
            else
                last = mid-1;
        }
        if (target > nums[mid]) {
            return mid+1;
        }
        else
            return mid;
    }

    public static void main(String[] args) {
        SearchInsertPosition s1 = new SearchInsertPosition();
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enyer element you want in array:");
        n = s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter all the elements:");
        for(int i=0; i<n;i++){
            a[i]=s.nextInt();
        }
        int res = s1.searchInsert(a,0);
        System.out.println(res);
    }
}
