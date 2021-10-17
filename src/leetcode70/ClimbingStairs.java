package leetcode70;

import java.util.Scanner;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n == 1){
            return n;
        }
        int firstStep = 1;
        int secondStep = 2;
        for(int i = 3; i<=n; i++){
            int temp = secondStep;
            secondStep = firstStep + secondStep;
            firstStep = temp;
        }
        return secondStep;

    }

    public static void main(String[] args) {
        ClimbingStairs c = new ClimbingStairs();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int result = c.climbStairs(n);
        System.out.println(result);
    }
}
