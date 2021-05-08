package leetcode303;

public class NumArray2 {
    int[] sumArray;
    public NumArray2(int[] nums) {
        sumArray = new int[nums.length];
        sumArray[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            sumArray[i] = sumArray[i - 1] + nums[i];
        }
    }
    public int sumRange(int left, int right) {
        return left==0?sumArray[right]:sumArray[right] - sumArray[left-1];
    }
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray r = new NumArray(nums);
        System.out.println(r.sumRange(0,2));
        System.out.println(r.sumRange(2,5));
        System.out.println(r.sumRange(0,5));

    }

}
