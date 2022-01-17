package leetcode326;

import java.util.Scanner;

public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        if(n<3) return false;
        while(n % 3 == 0){
            n = n/3;
        }
        return n==1;
    }

    public static void main(String[] args) {
        PowerofThree p = new PowerofThree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an int number : ");
        int n = sc.nextInt();
        boolean result = p.isPowerOfThree(n);
        System.out.println(result);

    }
}
