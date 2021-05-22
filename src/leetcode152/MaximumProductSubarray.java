package leetcode152;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if(nums.length == 0) return 0;
        int Cmax = nums[0];
        int Cmin = nums[0];
        int finalResult = nums[0];

        for(int i = 1; i<nums.length; i++){
            int temp = Math.max(nums[i]*Cmax, Math.max(nums[i] * Cmin,nums[i]));
            Cmin = Math.min(nums[i]*Cmax, Math.min(nums[i] * Cmin,nums[i]));
            Cmax = temp;
            finalResult = Math.max(finalResult,temp);
        }
        return finalResult;

    }

    public static void main(String[] args) {
        MaximumProductSubarray m = new MaximumProductSubarray();
        int[] nums = {-2,0,-1};
        int res = m.maxProduct(nums);
        System.out.println(res);
    }
}
