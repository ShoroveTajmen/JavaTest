package leetcode191;

import java.util.Scanner;

public class Numberof1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0, mask = 1;
        for(int i=0; i<32; i++){
            if((n & mask) != 0) count++;
                mask = mask << 1;
            }
        return count;

    }

    public static void main(String[] args) {
        Numberof1Bits nb = new Numberof1Bits();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 32 bit number :");
        int n = sc.nextInt();
        int result = nb.hammingWeight(n);
        System.out.println(result);
    }
}
