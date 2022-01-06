package leetcode55;

import java.util.Scanner;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int lastIndexCanReach = 0;
        for(int i = 0; i<=lastIndexCanReach; i++){
            lastIndexCanReach = Math.max(lastIndexCanReach, nums[i]+i);
            if(lastIndexCanReach >= nums.length-1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        JumpGame j = new JumpGame();
        Scanner sc = new Scanner(System.in);
        int nums[] = {3,2,1,0,4};
        boolean result = j.canJump(nums);
        System.out.println(result);
    }
}
