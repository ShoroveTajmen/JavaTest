package leetcode136;

import java.util.Arrays;
import java.util.Scanner;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
          int x = 0;
          for(int i = 0; i<nums.length; i++){
              x^= nums[i];
          }
        return x;
    }

    public static void main(String[] args) {
        SingleNumber s1 = new SingleNumber();
        Scanner s = new Scanner(System.in);
        int n;
        n=s.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        int res = s1.singleNumber(nums);
        System.out.println(res);
    }
}
