package Leetcode66;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int i;

        for( i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;

        }
        int[] result = new int[digits.length+1];
        result[0]=1;
        return result;
    }
    public static void main(String[] args) {
        PlusOne p = new PlusOne();
        Scanner s = new Scanner(System.in);
        System.out.println("Number of elements you want in array:");
        int n = s.nextInt();

        int[] digits = new int[n];
        System.out.println("Enter all the elements:");
        for(int i=0; i<n; i++){
            digits[i]=s.nextInt();
        }
        int[] res = p.plusOne(digits);
        System.out.println("Output:"+ Arrays.toString(res));

    }

}
