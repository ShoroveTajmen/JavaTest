package leetcode344;

import java.util.Scanner;

public class ReverseString {
    public String reverseString(char[] s) {
        int left = 0, right = s.length-1;
        while(left < right){

                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;

            left++;
            right--;
        }
        return new String(s);

    }

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        char[] a = sc.next().toCharArray();
         r.reverseString(a);
        System.out.println(a);


    }
}
