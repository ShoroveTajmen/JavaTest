package leetcode461;

import java.util.Scanner;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int xorResult = x^y;
        int count = 0;
        while(xorResult > 0){
            xorResult = xorResult & (xorResult - 1);
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        HammingDistance h = new HammingDistance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two int number :");
        System.out.println("First number is : ");
        int x = sc.nextInt();
        System.out.println("Enter second number is : ");
        int y = sc.nextInt();
        int result = h.hammingDistance(x,y);
        System.out.println(result);

    }
}
