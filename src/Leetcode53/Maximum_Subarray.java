package Leetcode53;

public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int Max_sub = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            Max_sub = Math.max(Max_sub, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return Max_sub;
    }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        Maximum_Subarray m = new Maximum_Subarray();
        int s = m.maxSubArray(nums);
        System.out.println("output: " +s);


    }
}

