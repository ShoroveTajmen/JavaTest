package leetcode190;

import java.util.Scanner;

public class ReverseBits {
    public int reverseBits(int n) {
        int finalResult = 0;
        for (int i = 1; i<=32; i++ ){
            finalResult = finalResult << 1;
            finalResult = finalResult | (n & 1);
            n = n >> 1;
        }
        return finalResult;

    }

    public static void main(String[] args) {
        ReverseBits r = new ReverseBits();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 32 bits number: ");
        int n = sc.nextInt();
        int result = r.reverseBits(n);
        System.out.println(result);

    }
}
