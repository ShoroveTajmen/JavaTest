package leetcode303;

import java.util.Scanner;

public class NumArray {
    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    public int sumRange(int left, int right) {
         int sum = 0;
         for(int i = left; i<= right; i++){
             sum = sum + nums[i];
       }
         return sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray r = new NumArray(nums);
//        Scanner sc = new Scanner(System.in);
//        int left = sc.nextInt();
//        int right = sc.nextInt();
//        System.out.println(r.sumRange(left,right));
        System.out.println(r.sumRange(0,2));
        System.out.println(r.sumRange(2,5));
        System.out.println(r.sumRange(0,5));

    }
}
