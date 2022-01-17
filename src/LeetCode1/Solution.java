package LeetCode1;
import java.util.Scanner;

public class Solution {
    static int  reverse(int x) {
        int rev_num = 0;
        while (x != 0) {
            int temp = rev_num;
            rev_num = rev_num * 10 + x % 10;
            x = x / 10;
            if(temp != rev_num/10){
                return 0;
            }
        }
        return (int)rev_num;


    }

    public static  void main(String[] args) {
        int x = 1534236469;
        System.out.println("Reverse number:" +reverse(x));
    }
}
