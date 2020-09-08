package Leetcode69;

import java.util.Scanner;

public class Mysqrt {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        long start = 1;
        long end = x;
        while(start<=end){
            long mid = (start+end)/2;
            if(mid*mid == x){
                return (int)mid;
            }
            else if(mid*mid > x){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return (int)end;

    }

    public static void main(String[] args) {
        Mysqrt s = new Mysqrt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input:");
        long x = sc.nextLong();
        long res = s.mySqrt((int) x);
        System.out.println(res);

    }
}
