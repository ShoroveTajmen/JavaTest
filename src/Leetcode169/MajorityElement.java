package Leetcode169;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int num = nums.length;
        return (nums[num/2]);
    }

    public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        Scanner s = new Scanner(System.in);
        int n;
        n=s.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        int res = m.majorityElement(nums);
        System.out.println(res);

    }
}
